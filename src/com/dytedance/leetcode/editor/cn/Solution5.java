package com.dytedance.leetcode.editor.cn;//给你一个字符串 s，找到 s 中最长的回文子串。
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 示例 3： 
//
// 
//输入：s = "a"
//输出："a"
// 
//
// 示例 4： 
//
// 
//输入：s = "ac"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母（大写和/或小写）组成 
// 
// Related Topics 字符串 动态规划 
// 👍 4428 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
public class Solution5 {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (0 == n) {
            return "";
        }
        int length = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        int resA = 0;
        int resB = 0;
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j]) {
                    if ((resB - resA) < (j - i)) {
                        resB = j;
                        resA = i;
                    }
                }
            }

        }
        return s.substring(resA, resB + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
