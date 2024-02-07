package com.vdovin.different_topics.prefix_sum;

import java.util.Arrays;

public class Task2574 {
    //Time: O(n)
    //Space: O(1)
    public static int[] leftRightDifference(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {10, 4, 8, 3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
