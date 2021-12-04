package com.dytedance.leetcode.editor.cn;//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
// Related Topics 数组 回溯 
// 👍 1671 👎 0


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)

@Slf4j
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0, 1);
        return res;
    }


    /**
     *
     * @param n 长度
     * @param output 带全排列的元数据
     * @param res 排列后的数据
     * @param first 当前准备排哪个数
     */
    private void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first, int deepth) {
        // 所有数都填完了
        if (first == n) {
            log.info("res: {}", output);
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {  // 选择填哪个数
            // 动态维护数组
            Collections.swap(output, first, i);
            log.info("{}正在把第{}个数字放在第{}个数字，排列结果 {}", getFlag(deepth), deepth, first + 1, i + 1, output);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1, ++deepth );
            // 撤销操作
            deepth --;
            Collections.swap(output, first, i);
        }
    }

    private String getFlag(int deepth) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < deepth ; i ++) {
             stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
