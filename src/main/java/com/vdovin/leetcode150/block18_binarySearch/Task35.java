package com.vdovin.leetcode150.block18_binarySearch;

import java.sql.Time;

public class Task35 {
    //Time: O(logn)
    //Space: O(1)
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r + 1;
    }}
