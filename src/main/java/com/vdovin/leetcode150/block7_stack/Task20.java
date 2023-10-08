package com.vdovin.leetcode150.block7_stack;

import java.util.Stack;

public class Task20 {
    //Time: O(n)
    //Space: O(n)
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (c == ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "(){}[]";
        String s2 = "[())]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
}
