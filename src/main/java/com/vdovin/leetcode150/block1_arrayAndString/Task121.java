package com.vdovin.leetcode150.block1_arrayAndString;

public class Task121 {
    //Time: O(n)
    //Space: O(n)
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        int diff = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            }

            diff = prices[i] - minValue;
            if (diff > maxProfit) {
                maxProfit = diff;
            }
        }
        return maxProfit;
    }
}
