package com.vdovin.leetcode150.block1_arrayAndString;

public class Task28 {
    public int strStr(String haystack, String needle) {
        int count = 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    count++;
                } else {
                    count = 0;
                    break;
                }
            }
            if (count == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
