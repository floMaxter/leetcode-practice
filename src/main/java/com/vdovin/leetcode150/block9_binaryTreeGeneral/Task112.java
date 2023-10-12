package com.vdovin.leetcode150.block9_binaryTreeGeneral;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task112 {
    //Iterative DFS
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<Integer> sum = new ArrayDeque<>();
        stack.push(root);
        sum.push(root.val);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int currSum = sum.pop();
            if (node.left == null && node.right == null) {
                if (currSum == targetSum) {
                    return true;
                }
            } else {
                if (node.right != null) {
                    stack.push(node.right);
                    sum.push(node.right.val + currSum);
                }
                if (node.left != null) {
                    stack.push(node.left);
                    sum.push(node.left.val + currSum);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, null, new TreeNode(1))));
        int target = 22;

        System.out.println(hasPathSum(root, target));
    }
}
