package com.vdovin.different_topics.prefix_sum;

import java.util.Arrays;

public class Task2574 {
    //Time: O(n^2)
    //Space: O(n)
    public static int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int leftSum = getPrefixSum(nums, 0, i);
            int rightSum = getPrefixSum(nums, i + 1, nums.length);
            res[i] = Math.abs(leftSum - rightSum);
        }
        return res;
    }

    public static int getPrefixSum(int[] nums, int l, int r) {
        int sum = 0;
        for (int i = l; i < r; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {10, 4, 8, 3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
