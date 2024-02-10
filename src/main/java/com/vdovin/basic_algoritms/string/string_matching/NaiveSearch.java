package com.vdovin.basic_algoritms.string.string_matching;

import java.util.ArrayList;
import java.util.List;

public class NaiveSearch {
    //Time: O(n^2);
    //Space: O(1);
    public static List<Integer> naiveSearch(String str, String pattern) {
        List<Integer> foundStartIndex = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            while (j < pattern.length() && i + j < str.length() && str.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == pattern.length()) {
                foundStartIndex.add(i);
            }
        }
        return foundStartIndex;
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        String s = "abcabcabc";
        String p = "abca";
        System.out.println(naiveSearch(s, p));
    }

    public static void test2() {
        String s = "abcabcabc";
        String p = "ab";
        System.out.println(naiveSearch(s, p));
    }

    public static void test3() {
        String s = "abcabcabc";
        String p = "a";
        System.out.println(naiveSearch(s, p));
    }
}
