package com.vdovin.different_topics.string_matching;

public class Task1455 {
    //Time: O(n^2)
    //Space: O(n)
    public static int isPrefixOfWord(String sentence, String searchWord) {
        int index = -1;
        String[] sentenceWords = sentence.split(" ");
        for (int i = 0; i < sentenceWords.length; i++) {
            String word = sentenceWords[i];
            int j = 0;
            while (j < searchWord.length() && j < word.length() && word.charAt(j) == searchWord.charAt(j)) {
                j++;
            }
            if (j == searchWord.length()) {
                index = i + 1;
                break;
            }
        }
        return index;
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
