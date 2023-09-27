package com.vdovin.leetcode150.block5_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Task383 {
    //Time: O(n + m), where n = ransomNote.size() and m = magazine.size()
    //Space: O(n)
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            Character c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            Character c = ransomNote.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) <= 0) {
                    map.remove(c);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
