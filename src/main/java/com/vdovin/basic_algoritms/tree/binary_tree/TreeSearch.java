package com.vdovin.basic_algoritms.tree.binary_tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class TreeSearch {
    public static void recursiveDFS(BinaryNode root) {
        System.out.print(root.value + " ");
        if (root.left != null) {
            recursiveDFS(root.left);
        }
        if (root.right != null) {
            recursiveDFS(root.right);
        }
    }

    public static void iterativeDFS(BinaryNode root) {
        Stack<BinaryNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryNode currNode = stack.pop();
            System.out.print(currNode.value + " ");
            if (currNode.right != null) {
                stack.push(currNode.right);
            }
            if (currNode.left != null) {
                stack.push(currNode.left);
            }
        }
    }

    public static void iterativeBFS(BinaryNode root) {
        Queue<BinaryNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currNode = queue.poll();
            System.out.print(currNode.value + " ");
            if (currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }
    }

    public static void recursiveBFS(BinaryNode root) {

    }
}
