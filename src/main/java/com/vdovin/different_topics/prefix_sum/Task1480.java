package com.vdovin.different_topics.prefix_sum;

public class Task1480 {
    //Time: O(n)
    //Space: O(1)
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
