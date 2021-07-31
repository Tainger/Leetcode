package com.dytedance.leetcode.editor.cn;

import java.util.List;

/**
 * @author jiazhiyuan
 * @date 2021/4/24 8:35 下午
 */
public class ACUtils {


    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     *
     * @param numbers
     */
    public static ListNode getListNode(Integer[] numbers) {
        ListNode pre = new ListNode(-1);
        ListNode res = pre;
        for (Integer number : numbers) {
            pre.next = new ListNode(number);
            pre = pre.next;
        }
        return res.next;
    }

    /**
     * 将字符串二维数组转化为正常可识别的数组
     */
//    public static int[][] getListNode(String str) {
//        String removeParentheses = str.substring(1, str.length() - 1);
//        String[] arr = removeParentheses.split(",");
//        for (String tempStr : arr) {
//            String subStr = tempStr.substring(1, tempStr.length() - 1);
//            String[] split = subStr.split(",");
//        }
//
//    }



}



    
