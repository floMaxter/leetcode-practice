package com.vdovin.needcode.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

public class Task242 {
    //Time: O(n)
    //Space: O(n)
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            int counterCurrValue = mapS.getOrDefault(t.charAt(i), 0);
            if (counterCurrValue == 0) {
                return false;
            } else {
                mapS.put(t.charAt(i), mapS.get(t.charAt(i)) - 1);
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
