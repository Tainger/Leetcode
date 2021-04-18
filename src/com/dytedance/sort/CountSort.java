package com.dytedance.sort;

/**
 * @author jiazhiyuan
 * @date 2021/4/18 12:32 下午
 */
public class CountSort {
    public static void main(String[] args) {

        int arr[] = new int[]{0,2, 4, 5, 22,  7,77, 2, 3, 4, 5, 100};
        int[] ints = countSort(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] countSort(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] res = new int[arr.length];
        //O(n)
        for (int j : arr) {
            min = Math.min(j, min);
            max = Math.max(j, max);
        }
        int[] pos = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            //因为此处计数是从 0 开始的。
            pos[arr[i]]++;
        }
        for (int i = 1; i < pos.length; i++) {
            pos[i] = pos[i] + pos[i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            //因为此处计数是从 0 开始的。
            res[pos[arr[i]]-1] = arr[i];
            pos[arr[i]]--;
        }
        return res;
    }
    //计数排序本质就是用数组存储一个映射关系把它的位置保存起来，然后再遍历原先的数组从位置数组中把它拿出来进行排序。
    //计数排序，所排序的数组中必须为非负整数，因为数组的下标被限制了。
}



    
