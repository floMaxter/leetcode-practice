package com.vdovin.leetcode150.block5_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task290 {
    //Time: O(n)
    //Space: O(n
    public static boolean wordPattern(String pattern, String s) {
        String[] strSplit = s.split(" ");
        if (strSplit.length != pattern.length()) {
            return false;
        }

        Map<Character, String> mapPS = new HashMap<>();
        Map<String, Character> mapSP = new TreeMap<>();
        for (int i = 0; i < strSplit.length; i++) {
            Character currCharacter = pattern.charAt(i);
            String currStr = strSplit[i];

            if (mapPS.containsKey(currCharacter) && !mapPS.get(currCharacter).equals(currStr)
                || mapSP.containsKey(currStr) && !mapSP.get(currStr).equals(currCharacter)) {
                return false;
            }

            mapPS.put(pattern.charAt(i), strSplit[i]);
            mapSP.put(strSplit[i], pattern.charAt(i));
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
