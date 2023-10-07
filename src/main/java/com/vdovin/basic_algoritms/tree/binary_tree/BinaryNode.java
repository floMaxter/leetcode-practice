package com.vdovin.basic_algoritms.tree.binary_tree;

public class BinaryNode {
    int value;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(int value) {
        this.value = value;
    }
}
