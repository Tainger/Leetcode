package com.main.preview;

import com.dytedance.sort.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiazhiyuan
 * @date 2021/12/6 12:17 上午
 */
public class TestSort {


    /***
     * 测试一波快速排序
     */
    @Test
    public void testQuickSort() {
        int[] num = {3, 45, 78, 64, 52, 11, 64, 55, 99, 11, 18};
        QuickSort.quickSort(num, 0, num.length - 1);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }


    /***
     * 测试一波快速排序
     */
    @Test
    public void testQuickSort2(String[] strs) {



    }
}



    
