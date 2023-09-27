package com.vdovin.leetcode150.block1_arrayAndString;

public class Task55 {
    //Time: O(n)
    //Space: O(1)
    public boolean canJump(int[] nums) {
        int i = 0;
        int countJump = 0;
        while (i < nums.length && countJump != -1) {
            if (i == nums.length - 1) {
                return true;
            }
            if (nums[i] > countJump) {
                countJump = nums[i];
            } else {
                countJump--;
                i++;
            }
        }
        return false;
    }
}
