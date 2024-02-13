package com.vdovin.different_topics.string_matching;

public class Task1455 {
    //Time: O(n * m)
    //Space: O(1)
    public static int isPrefixOfWord(String sentence, String searchWord) {
        boolean isWord = true;
        int wordCount = 1;
        int searchWordPos = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (isWord) {
                if (sentence.charAt(i) == searchWord.charAt(searchWordPos)) {
                    searchWordPos++;
                    if (searchWordPos == searchWord.length()) {
                        return wordCount;
                    }
                } else {
                    isWord = false;
                }
            }

            if (sentence.charAt(i) == ' ') {
                isWord = true;
                searchWordPos = 0;
                wordCount++;
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
