package com.dytedance.dp;

/**
 * @author jiazhiyuan
 * @date 2021/12/6 10:53 下午
 */
public class WanquanBeiBaoOptimize {


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
    public int bag(int[] w, int[] v, int N, int W) {
        //创建备忘录
        int[][] dp = new int[N + 1][W + 1];

        //初始化参数
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        //遍历每一个商品


        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                //策略变了
                dp[i][j] = dp[i - 1][j];
                if(w[i] <= j) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);
                }
            }
        }
        return dp[N][W];
        //遍历每一个背包
    }


    public static void main(String[] args) {

        int N = 3;   // 物品有三个
        int W = 5;   //背包容量有5个

        int w[] = new int[]{0, 3, 2, 1};

        int v[] = new int[]{0, 5, 2, 3};


        int bag = new WanquanBeiBaoOptimize().bag(w, v, N, W);

        System.out.println(bag);
    }
}



    
