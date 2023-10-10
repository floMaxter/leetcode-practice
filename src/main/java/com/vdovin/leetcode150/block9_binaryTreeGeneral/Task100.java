package com.vdovin.leetcode150.block9_binaryTreeGeneral;

import java.util.Stack;

public class Task100 {
    //Iterative DFS
    //Time: O(min(n, m))
    //Space: O(min(log n, log m))
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();
        while (p != null || !stackP.isEmpty() || q != null || !stackQ.isEmpty()) {
            while (p != null) {
                stackP.push(p);
                p = p.left;
            }
            while (q != null) {
                stackQ.push(q);
                q = q.left;
            }
            if (stackP.size() != stackQ.size()) {
                return false;
            }

            p = stackP.pop();
            q = stackQ.pop();
            if (p.val != q.val) {
                return false;
            }
            p = p.right;
            q = q.right;
        }
        return true;
     }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(tree1, tree2));
    }
}
