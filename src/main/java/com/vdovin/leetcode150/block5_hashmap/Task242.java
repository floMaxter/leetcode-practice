package com.vdovin.leetcode150.block5_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Task242 {
    //Time: O(n)
    //Space: O(n)
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
            Character currChar = entry.getKey();
            Integer currCountChar = entry.getValue();
            if (!mapT.containsKey(currChar) || !mapT.get(currChar).equals(currCountChar)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        String s1 = "anagram";
//        String s2 = "nagaram";
//        System.out.println(isAnagram(s1, s2));

        String s3 = "rat";
        String s4 = "car";
        System.out.println(isAnagram(s3, s4));
    }
}
