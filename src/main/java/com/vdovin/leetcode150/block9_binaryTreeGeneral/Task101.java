package com.vdovin.leetcode150.block9_binaryTreeGeneral;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Task101 {
    //BFS
    //Time: O(min(n, m))
    //Space: O(min(n, m))
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null || root.right == null) return root.left == root.right;

        Queue<TreeNode> queue1 = new ArrayDeque<>();
        Queue<TreeNode> queue2 = new ArrayDeque<>();
        queue1.add(root.left);
        queue2.add(root.right);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode r1 = queue1.remove();
            TreeNode r2 = queue2.remove();
            if (r1.val != r2.val) {
                return false;
            }

            if (r1.left != null && r2.right != null) {
                queue1.add(r1.left);
                queue2.add(r2.right);
            } else if (r1.left != null || r2.right != null) {
                return false;
            }

            if (r1.right != null && r2.left != null) {
                queue1.add(r1.right);
                queue2.add(r2.left);
            } else if (r1.right != null || r2.left != null) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));
        System.out.println(isSymmetric(root2));
    }
}
