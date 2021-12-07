package com.dytedance.dp;

/**
 * @author jiazhiyuan
 * @date 2021/12/6 10:53 下午
 */
public class WanquanBeiBaoBiaoDa {


    /***
     *
     * 递归是自顶向下的， dp是自底向上的，
     *
     * 递归的结束条件的状态参数的值，就是dp初始的值
     *
     * @param w   每个物品对应的重量
     * @param v   每个物品对应的价值
     * @param N    物品的个数
     * @param W    背包的重量
     * @return
     */
    int bag(int[] w, int[] v, int N, int W) {
        // 创建备忘录
        int[][] dp = new int[N + 1][W + 1];
        // 初始化状态
        for (int i = 0; i < N + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }
        // 遍历每一件物品
        for (int tn = 1; tn < N + 1; tn++) {
            // 背包容量有多大就还要计算多少次
            for (int rw = 1; rw < W + 1; rw++) {
                dp[tn][rw] = dp[tn - 1][rw];
                // 根据rw尝试放入多次物品,从中找出最大值,作为当前子问题的最优解
                for (int k = 0; k <= rw / w[tn]; k++) {
                    dp[tn][rw] = Math.max(dp[tn][rw], dp[tn - 1][rw - k * w[tn]] + k * v[tn]);
                }
            }
        }
        return dp[N][W];
    }


    public static void main(String[] args) {

        int N = 3;   // 物品有三个
        int W = 5;   //背包容量有5个

        int w[] = new int[]{0, 3, 2, 1};

        int v[] = new int[]{0, 5, 2, 3};


        int bag = new WanquanBeiBaoBiaoDa().bag(w, v, N, W);

        System.out.println(bag);
    }
}



    
