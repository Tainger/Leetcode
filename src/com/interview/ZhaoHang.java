package com.interview;

/**
 * @author jiazhiyuan
 * @date 2021/11/13 8:27 下午
 */
public class ZhaoHang {

    public int getMaxValue(int[] nums, int[] values) {
        return  computeMaxValue(nums, values, 0, nums.length - 1);
    }

    private int computeMaxValue(int[] nums, int[] values, int head, int tail) {
        if(tail < head) {
            return 0;
        }
        return Math.max(nums[head] * values[head]  + computeMaxValue(nums, values, head + 1, tail),
                nums[tail] * values[head]  + computeMaxValue(nums, values, head, tail - 1));
    }


    public static void main(String[] args) {
        int arr[] = new int[] {1, 100};
        int res[] = new int[] {2, 1};
        ZhaoHang zhaoHang = new ZhaoHang();
        int maxValue = zhaoHang.getMaxValue(arr, res);
        System.out.println(maxValue);

        int arr1[] = new int[] {1,3,5,2,4};
        int res1[] = new int[] {1,2,3,4,5};

        int maxValue1 = zhaoHang.getMaxValue(arr1, res1);
        System.out.println(maxValue1);

        int arr2[] = new int[] {1};
        int res2[] = new int[] {1};

        int maxValue2 = zhaoHang.getMaxValue(arr2, res2);
        System.out.println(maxValue2);

    }
}



    
