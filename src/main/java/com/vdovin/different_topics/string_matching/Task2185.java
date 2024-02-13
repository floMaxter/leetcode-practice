package com.vdovin.different_topics.string_matching;

public class Task2185 {
    //Time: O(n^2);
    //Space: O(1);
    public static int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            int j = 0;
            while (j < pref.length() && j < word.length() && word.charAt(j) == pref.charAt(j)) {
                j++;
            }
            if (j == pref.length()) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        String[] words = new String[]{"pay", "attention", "practice", "attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }

    public static void test2() {
        String[] words = new String[]{"leetcode","win","loops","success"};
        String pref = "code";
        System.out.println(prefixCount(words, pref));

    }
}
