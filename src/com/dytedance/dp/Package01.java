package com.dytedance.dp;

/**
 * @author jiazhiyuan
 * @date 2021/6/6 9:18 上午
 */
public class Package01 {

    /**
     *  示例: 输入:W = 5, N = 3      w = [3, 2, 1], v = [5, 2, 3]
     *  输出:8
     *  解释:选择 i=0 和 i=2 这两件物品装进背包。它们的总重量 4 小于 W,同时可以获得最大价值 8。
     * @param args
     */
    public static void main(String[] args) {
        int N = 3;   //0,1,2,3
        int W = 5;
        int[] w = {0, 3, 2, 1};
        int[] v = {0, 5, 2, 3};
        dp(w, v, N, W);
        System.out.println(dp(w, v, N, W));;
    }

    private static int dp(int[] w, int[] v, int N, int W) {
        //创建备忘录
        int[][] dp = new int[N + 1][W + 1];

        //初始化状态
        for (int i = 0; i < N + 1; i++) dp[i][0] = 0;
        for (int j = 0; j < W + 1; j++) dp[0][j] = 0;

        //遍历
        for(int tn = 1; tn < N + 1; tn ++) {  //遍历一次商品
            for(int rw = 1; rw < W + 1; rw ++) {  //背包容量有多大就遍历多少次
                //当背包剩余容量小于第tn件商品时，只放入前tn-1，
                if(rw < w[tn]) {
                    dp[tn][rw] = dp[tn-1][rw];
                }else {
                    //当背包剩余容量大于
                    dp[tn][rw] = Math.max(dp[tn-1][rw], dp[tn-1][rw-w[tn]] + v[tn]);
                }
            }
        }
        return dp[N][W];
    }
}



    
