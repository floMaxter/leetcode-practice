package com.vdovin.leetcode150.block1_arrayAndString;

public class Task80 {
    //Space: O(1)
    //Time: O(n)
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
