package com.dytedance.leetcode.editor.cn;//给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
//
// 数组中的每个元素代表你在该位置可以跳跃的最大长度。 
//
// 判断你是否能够到达最后一个下标。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,3,1,1,4]
//输出：true
//解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,1,0,4]
//输出：false
//解释：无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 104 
// 0 <= nums[i] <= 105 
// 
// Related Topics 贪心 数组 动态规划 
// 👍 1525 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution55 {

    public boolean canJump2(int[] nums) {
        int n = nums.length;
        if (nums.length == 0 || nums.length == 1) {
            return true;
        }
        int max = 0;
        for (int i = 0; i <= max; i++) {
            max = Math.max(nums[i] + i, max);
            if (max >= n - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return true;
        }
        boolean[] dp = new boolean[n];
        // 初始化状态
        for (int i = 0; i < n; i++) {
            dp[i] = false;
        }
        dp[0] = true;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // j < i
                if (dp[j] && j + nums[j] >= i) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n - 1];
        // 输出答案
    }

    public static void main(String[] args) {

        Solution55 solution55 = new Solution55();
        boolean b = solution55.canJump(new int[]{2, 0, 0});
        System.out.println(b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
