package com.dytedance.leetcode.editor.cn;//存在一个由 n 个不同元素组成的整数数组 nums ，但你已经记不清具体内容。好在你还记得 nums 中的每一对相邻元素。
//
// 给你一个二维整数数组 adjacentPairs ，大小为 n - 1 ，其中每个 adjacentPairs[i] = [ui, vi] 表示元素 ui
// 和 vi 在 nums 中相邻。 
//
// 题目数据保证所有由元素 nums[i] 和 nums[i+1] 组成的相邻元素对都存在于 adjacentPairs 中，存在形式可能是 [nums[i]
//, nums[i+1]] ，也可能是 [nums[i+1], nums[i]] 。这些相邻元素对可以 按任意顺序 出现。 
//
// 返回 原始数组 nums 。如果存在多种解答，返回 其中任意一个 即可。 
//
// 
//
// 示例 1： 
//
// 
//输入：adjacentPairs = [[2,1],[3,4],[3,2]]
//输出：[1,2,3,4]
//解释：数组的所有相邻元素对都在 adjacentPairs 中。
//特别要注意的是，adjacentPairs[i] 只表示两个元素相邻，并不保证其 左-右 顺序。
// 
//
// 示例 2： 
//
// 
//输入：adjacentPairs = [[4,-2],[1,4],[-3,1]]
//输出：[-2,4,1,-3]
//解释：数组中可能存在负数。
//另一种解答是 [-3,1,4,-2] ，也会被视作正确答案。
// 
//
// 示例 3： 
//
// 
//输入：adjacentPairs = [[100000,-100000]]
//输出：[100000,-100000]
// 
//
// 
//
// 提示： 
//
// 
// nums.length == n 
// adjacentPairs.length == n - 1 
// adjacentPairs[i].length == 2 
// 2 <= n <= 105 
// -105 <= nums[i], ui, vi <= 105 
// 题目数据保证存在一些以 adjacentPairs 作为元素对的数组 nums 
// 
// Related Topics 数组 哈希表 
// 👍 78 👎 0


import org.junit.jupiter.api.Test;

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1743 {
    public int[] restoreArray(int[][] adjacentPairs) {

        //做处理
        Map<Integer, List<Integer>> table = new HashMap<>();
        for(int i = 0; i < adjacentPairs.length; i++) {
            table.putIfAbsent(adjacentPairs[i][0], new ArrayList<>());
            table.putIfAbsent(adjacentPairs[i][1], new ArrayList<>());
            table.get(adjacentPairs[i][0]).add(adjacentPairs[i][1]);
            table.get(adjacentPairs[i][1]).add(adjacentPairs[i][0]);
        }
        int n = adjacentPairs.length;
        int reset[] = new int[n + 1];


        //找出首
        for(Map.Entry<Integer, List<Integer>> entry : table.entrySet()) {
            if(entry.getValue().size() == 1) {
                reset[0] = entry.getKey();
                break;
            }
        }

        for(int i = 1; i < n + 1; i++) {
            if(table.get(reset[i-1]).size() == 1) {
                Integer integer = table.get(reset[i - 1]).get(0);
                reset[i] = integer;
            }else {
                Integer tempLeft = table.get(reset[i - 1]).get(0);
                Integer tempRight = table.get(reset[i - 1]).get(1);
                if(reset[i-2] == tempRight) {
                    reset[i] = tempLeft;
                }else {
                    reset[i] = tempRight;
                }
            }
        }
        return reset;
    }


    @Test
    public void test() {
        int[][] adjacentPairs = new int[][] {
                {2,1},{3,4},{3,2}
        };
        Solution1743 solution1743 = new Solution1743();
        int[] ints = solution1743.restoreArray(adjacentPairs);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
