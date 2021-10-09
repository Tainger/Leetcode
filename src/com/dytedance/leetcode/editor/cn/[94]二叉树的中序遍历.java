package com.dytedance.leetcode.editor.cn;//给定一个二叉树的根节点 root ，返回它的 中序 遍历。
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 示例 4： 
//
// 
//输入：root = [1,2]
//输出：[2,1]
// 
//
// 示例 5： 
//
// 
//输入：root = [1,null,2]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树 
// 👍 1121 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import com.dytedance.leetcode.editor.cn.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        traverse(root, nodeList);
        return nodeList;
    }

    public void traverse(TreeNode root, List<Integer> nodeList) {
        if(root == null) {
            return;
        }
        traverse(root.left, nodeList);
        nodeList.add(root.val);
        traverse(root.right, nodeList);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
class Solution95 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        traverse(root, nodeList);
        return nodeList;
    }

    public void traverse(TreeNode root, List<Integer> nodeList) {
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()) {
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            nodeList.add(root.val);
            root = root.right;
        }
    }
}