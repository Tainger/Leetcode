package com.dytedance.leetcode.editor.cn;//给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
//
// 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。 
//
// 注意: 
//假设字符串的长度不会超过 1010。 
//
// 示例 1: 
//
// 
//输入:
//"abccccdd"
//
//输出:
//7
//
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
// Related Topics 贪心 哈希表 字符串 
// 👍 360 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
public class Solution409 {
    public int getLongestPalindromeSubseq(String s) {
        int n = s.length();
        if (0 == n) return 0;
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }
        for (int i = 0; i < n; i++) dp[i][i] = 1; // 初始化状态
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]); // 作出进一步决策
                }
            }
        }
        return dp[0][n - 1]; // 输出答案
    }
}
//leetcode submit region end(Prohibit modification and deletion)
