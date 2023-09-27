package com.vdovin.leetcode150.block2_twoPointers;

public class Task167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[] {-1, -1};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                }
            }
        }
        return res;
    }
}
