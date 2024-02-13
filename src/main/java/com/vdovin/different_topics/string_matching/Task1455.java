package com.vdovin.different_topics.string_matching;

public class Task1455 {
    //Time: O(n^2)
    //Space: O(n)
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 1; i <= sentence.length(); i++) {
            if (words[i - 1].startsWith(searchWord)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        String text = "I love eating burger";
        String pattern = "burger";
        System.out.println(isPrefixOfWord(text, pattern));
    }

    public static void test2() {
        String text = "this problem is an easy problem";
        String pattern = "pro";
        System.out.println(isPrefixOfWord(text, pattern));
    }
}
