package com.dytedance.dynammic.interview.greed;

/**
 * @author jiazhiyuan
 * @date 2021/6/12 9:13 下午
 */
public class Greed {

    int getMinCoinCountHelper(int total, int[] values, int valueCount) {
        int rest = total;
        int count = 0;     // 从大到小遍历所有面值
         for (int i = 0; i < valueCount; ++ i) {
             int currentCount = rest / values[i]; // 计算当前面值最多能用多少个
             rest -= currentCount * values[i]; // 计算使用完当前面值后的余额
             count += currentCount; // 增加当前面额用量
             if (rest == 0) {
                 return count;
             }
         }
         return -1; // 如果到这里说明无法凑出总价,返回-1
    }

    int getMinCoinCount() {
        int[] values = {5, 3}; // 硬币面值
        int total = 11; // 总价
        return getMinCoinCountHelper(total, values, 2); // 输出结果
    }
}



    
