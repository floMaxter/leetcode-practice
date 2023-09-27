package com.vdovin.leetcode150.block1_arrayAndString;

import java.sql.Time;

public class Task189 {
    //Time: O(n)
    //Space: O(1)
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums, 0, nums.length - k - 1);
        reverseArray(nums, nums.length - k, nums.length - 1);
        reverseArray(nums, 0, nums.length - 1);
    }

    private void reverseArray(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
