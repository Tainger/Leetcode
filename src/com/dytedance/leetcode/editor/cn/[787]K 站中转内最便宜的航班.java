package com.dytedance.leetcode.editor.cn;//有 n 个城市通过一些航班连接。给你一个数组 flights ，其中 flights[i] = [fromi, toi, pricei] ，表示该航班都从城
//市 fromi 开始，以价格 pricei 抵达 toi。 
//
// 现在给定所有的城市和航班，以及出发城市 src 和目的地 dst，你的任务是找到出一条最多经过 k 站中转的路线，使得从 src 到 dst 的 价格最便
//宜 ，并返回该价格。 如果不存在这样的路线，则输出 -1。 
//
// 
//
// 示例 1： 
//
// 
//输入: 
//n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
//src = 0, dst = 2, k = 1
//输出: 200
//解释: 
//城市航班图如下
//
//
//从城市 0 到城市 2 在 1 站中转以内的最便宜价格是 200，如图中红色所示。 
//
// 示例 2： 
//
// 
//输入: 
//n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
//src = 0, dst = 2, k = 0
//输出: 500
//解释: 
//城市航班图如下
//
//
//从城市 0 到城市 2 在 0 站中转以内的最便宜价格是 500，如图中蓝色所示。 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 100 
// 0 <= flights.length <= (n * (n - 1) / 2) 
// flights[i].length == 3 
// 0 <= fromi, toi < n 
// fromi != toi 
// 1 <= pricei <= 104 
// 航班没有重复，且不存在自环 
// 0 <= src, dst, k < n 
// src != dst 
// 
// Related Topics 深度优先搜索 广度优先搜索 图 动态规划 最短路 堆（优先队列） 
// 👍 372 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // 用来记录（当前城市，可以飞往城市的信息列表（每一项包含[城市坐标,费用]））
        Map<Integer, List<int[]>> map = new HashMap<>();
        // 建立map信息
        for(int[] flight: flights) {
            List<int[]> list = map.getOrDefault(flight[0], new ArrayList<>());
            list.add(new int[]{flight[1], flight[2]});
            map.put(flight[0], list);
        }
        // 用来记录飞到该城市的时候，最小的费用
        int[] minValues = new int[n];
        Arrays.fill(minValues, Integer.MAX_VALUE);
        // 起始点的费用是0
        minValues[src] = 0;
        // 两个队列：记录城市坐标和当前累积的费用
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queueValue = new LinkedList<>();
        queue.offer(src);
        queueValue.offer(0);
        // 记录当前经过的站数，大于K直接跳出
        int count = 0;
        int ans = Integer.MAX_VALUE;
        while(!queue.isEmpty()) {
            if(count > K) break;
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int f = queue.poll();
                int v = queueValue.poll();
                List<int[]> list = map.getOrDefault(f, new ArrayList<>());
                // 遍历能飞往的下一个城市
                for(int[] nextF: list) {
                    // 如果下一个城市是目的地，更新最小的费用
                    if(nextF[0] == dst) {
                        ans = Math.min(ans, v+nextF[1]);
                        continue;
                    }
                    // 如果飞往下一个城市的费用小于当前的最小值，才更新；如果已经大于现在的最小值，不放入队列中
                    if(minValues[nextF[0]] > v + nextF[1]) {
                        minValues[nextF[0]] = v + nextF[1];
                        queue.offer(nextF[0]);
                        queueValue.offer(v+nextF[1]);
                    }
                }
            }
            count++;
        }
        // 说明在经过K站中转后，不能飞到目的地，返回-1
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
