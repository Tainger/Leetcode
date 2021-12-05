package com.dytedance.leetcode.editor.cn;
//有一堆石头，每块石头的重量都是正整数。
//
// 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下： 
//
// 
// 如果 x == y，那么两块石头都会被完全粉碎； 
// 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。 
// 
//
// 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。 
//
// 
//
// 示例： 
//
// 
//输入：[2,7,4,1,8,1]
//输出：1
//解释：
//先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
//再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
//接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
//最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。 
//
// 
//
// 提示： 
//
// 
// 1 <= stones.length <= 30 
// 1 <= stones[i] <= 1000 
// 
// Related Topics 数组 堆（优先队列） 
// 👍 180 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
public class Solution1046 {


    public int lastStoneWeight(int[] stones) {
        int value = getValue(stones);
        int m = stones.length;
        int n = value;
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) dp[i][0] = 0;
        for (int j = 0; j < n + 1; j++) dp[0][j] = 0;


        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (stones[i-1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i-1]] + stones[i-1]);
                }
            }

        }
        return getSum(stones) - 2 * dp[m][n];
    }

    /**
     * 计算有价值的参数
     *
     * @param stones
     * @return
     */
    private int getValue(int[] stones) {
        int res = 0;
        for (int i = 0; i < stones.length; i++) {
            res += stones[i];
        }
        return res / 2;
    }


    private int getSum(int[] stones) {
        int sum = 0;
        for(int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] stone = new int[]{4,3,4,3,2};
        Solution1046 solution1046 = new Solution1046();
        int i = solution1046.lastStoneWeight(stone);
        System.out.println(i);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
