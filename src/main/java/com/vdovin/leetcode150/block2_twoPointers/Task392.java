package com.vdovin.leetcode150.block2_twoPointers;

import java.sql.Time;

public class Task392 {
    //Time: O(max(n, m))
    //Space: O(1)
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i == s.length();
    }
}
