package com.vdovin.leetcode150.block1_arrayAndString;

public class Task27 {
    //Space: O(1)
    //Time: O(n)
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
