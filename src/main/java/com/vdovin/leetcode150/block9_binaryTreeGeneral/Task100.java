package com.vdovin.leetcode150.block9_binaryTreeGeneral;

import java.util.Stack;

public class Task100 {
    //Recursive DFS
    //Time: O(min(n, m))
    //Space: O(min(log n, log m))
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
     }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(tree1, tree2));
    }
}
