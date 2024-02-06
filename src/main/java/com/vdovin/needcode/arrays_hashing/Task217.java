package com.vdovin.needcode.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

public class Task217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> setNumbers = new HashSet<>();
        for (int num : nums) {
            if (setNumbers.contains(num)) {
                return true;
            } else {
                setNumbers.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
