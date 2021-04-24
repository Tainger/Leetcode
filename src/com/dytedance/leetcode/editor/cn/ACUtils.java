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

    public static void main(String[] args) {
        ListNode listNode = getListNode(new Integer[]{1, 2, 3, 4, 5});
        printListNode(listNode);
    }
}



    
