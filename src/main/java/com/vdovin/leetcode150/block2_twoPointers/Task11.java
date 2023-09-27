package com.vdovin.leetcode150.block2_twoPointers;

public class Task11 {
    //Time: O(n)
    //Space: O(1)
    public int maxArea(int[] height) {
        int maxV = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int currV = Math.min(height[l], height[r]) * (r - l);
            if (maxV < currV) {
                maxV = currV;
            }
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxV;
    }
}
