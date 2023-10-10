package com.vdovin.leetcode150.block9_binaryTreeGeneral;

import java.util.ArrayDeque;
import java.util.Queue;

public class Task100 {
    //Iterative DFS
    //Time: O(min(n, m))
    //Space: O(min(log n, log m))
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        q1.add(p);
        q2.add(q);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode r1 = q1.remove();
            TreeNode r2 = q2.remove();
            if (r1.val != r2.val) {
                return false;
            }

            if (r1.left != null && r2.left != null) {
                q1.add(r1.left);
                q2.add(r2.left);
            } else if (r1.left != null || r2.left != null) {
                return false;
            }

            if (r1.right != null && r2.right != null) {
                q1.add(r1.right);
                q2.add(r2.right);
            } else if (r1.right != null || r2.right != null) {
                return false;
            }
        }
        return true;
     }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(tree1, tree2));
    }
}
