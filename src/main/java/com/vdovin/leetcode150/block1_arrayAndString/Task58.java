package com.vdovin.leetcode150.block1_arrayAndString;

public class Task58 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && flag) {
                break;
            } else if (s.charAt(i) != ' ') {
                flag = true;
                count++;
            }
        }

        return count;
    }
}
