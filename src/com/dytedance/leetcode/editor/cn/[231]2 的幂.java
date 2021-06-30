package dytedance.leetcode.editor.cn;
//给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。 
//
// 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 1
//输出：true
//解释：20 = 1
// 
//
// 示例 2： 
//
// 
//输入：n = 16
//输出：true
//解释：24 = 16
// 
//
// 示例 3： 
//
// 
//输入：n = 3
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：n = 4
//输出：true
// 
//
// 示例 5： 
//
// 
//输入：n = 5
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -231 <= n <= 231 - 1 
// 
//
// 
//
// 进阶：你能够不使用循环/递归解决此问题吗？ 
// Related Topics 位运算 数学 
// 👍 358 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if(n < 0) {
            return false;
        }
        while (n %2 ==0){
            n = n / 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution231 solution231 = new Solution231();
        boolean powerOfTwo = solution231.isPowerOfTwo(4);
        System.out.println(powerOfTwo);
        boolean powerOfTwo2 = solution231.isPowerOfTwo(10);
        System.out.println(powerOfTwo2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
