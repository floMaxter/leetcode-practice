package com.vdovin.leetcode150.block9_binaryTreeGeneral;

import java.util.Stack;

public class Task104 {
    //Iterative DFS
    //Time: O(n)
    //Space: O(n)
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int max = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);
            if (node.right != null) {
                stack.push(node.right);
                value.push(temp+1);
            }
            if (node.left != null) {
                stack.push(node.left);
                value.push(temp+1);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(maxDepth(tree));
        TreeNode tree2 = new TreeNode();
    }
}
