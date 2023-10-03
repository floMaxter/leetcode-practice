package com.vdovin.leetcode150.block5_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Task205 {
    //Time: O(n)
    //Space: O(n)
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);

            //Символ есть в мапе и он не равен текущему значению == сопоставление неверно
            if (mapST.containsKey(cS) && !mapST.get(cS).equals(cT)
                || mapTS.containsKey(cT) && !mapTS.get(cT).equals(cS)) {
               return false;
            }

            mapST.put(cS, cT);
            mapTS.put(cT, cS);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "dar"));
    }
}
