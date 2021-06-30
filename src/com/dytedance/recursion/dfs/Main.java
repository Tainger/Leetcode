package com.dytedance.recursion.dfs;

/**
 * @author jiazhiyuan
 * @date 2021/6/27 10:05 上午
 */
public class Main {


    public boolean isCould(int n, int arr[], int k) {
        return dfs(0, arr, 0, k);
    }

    private boolean dfs(int i, int arr[], int sum, int k) {
        if (i == arr.length) {
            return sum == k;
        }

        if (dfs(i + 1, arr, sum, k)) return true;

        if (dfs(i + 1, arr, sum + arr[i], k)) return true;

        return false;
    }


    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[]{1, 2, 4, 7};
        int k = 13;
        Boolean res = new Main().isCould(n, arr, k);
        System.out.println(res);
    }

}



    
