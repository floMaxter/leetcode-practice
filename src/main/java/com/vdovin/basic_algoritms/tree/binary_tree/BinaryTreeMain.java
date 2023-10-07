package com.vdovin.basic_algoritms.tree.binary_tree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryNode tree = new BinaryNode(20,
                new BinaryNode(7,
                        new BinaryNode(4, null, new BinaryNode(6)), new BinaryNode(9)),
                new BinaryNode(35,
                        new BinaryNode(31, new BinaryNode(28), null),
                        new BinaryNode(40, new BinaryNode(38), new BinaryNode(52))));
        System.out.println("Recursive BFS");
        System.out.println("*********************");
        TreeSearch.recursiveDFS(tree);
        System.out.println("\n");

        System.out.println("Iterative BFS");
        System.out.println("*********************");
        TreeSearch.iterativeDFS(tree);
        System.out.println("\n");

        System.out.println("Iterative BFS");
        System.out.println("*********************");
        TreeSearch.iterativeBFS(tree);
    }
}
