package com.vdovin.leetcode150.block1_arrayAndString;

public class Task169 {
    //Time: O(n)
    //Space: O(1)
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (Integer value : nums) {
            if (count == 0)
                candidate = value;

            if (value == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
