package com.vdovin.leetcode150.block1_arrayAndString;

public class Task26 {
    // Time: O(n)
    // Space: O(1)
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
