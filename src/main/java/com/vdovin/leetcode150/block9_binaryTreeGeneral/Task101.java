package com.vdovin.leetcode150.block9_binaryTreeGeneral;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task101 {
    //Iterative DFS
    //Time: O(min(n, m))
    //Space: O(min(n, m))
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Deque<TreeNode> stackL = new ArrayDeque<>();
        Deque<TreeNode> stackR = new ArrayDeque<>();
        TreeNode left = root.left;
        TreeNode right = root.right;
        while (left != null || !stackL.isEmpty() ||
               right != null || !stackR.isEmpty()) {
            while (left != null) {
                stackL.push(left);
                left = left.left;
            }
            while (right != null) {
                stackR.push(right);
                right = right.right;
            }

            if (stackL.size() != stackR.size()) {
                return false;
            }
            left = stackL.pop();
            right = stackR.pop();
            if (left.val != right.val) {
                return false;
            }
            left = left.right;
            right = right.left;
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println(isSymmetric(root));
    }
}
