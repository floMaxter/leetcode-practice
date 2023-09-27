package com.vdovin.leetcode150.block1_arrayAndString;

public class Task88 {
    //Space: O(1)
    //Time: O(n.length)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pNums1 = m - 1;
        int pNums2 = n - 1;
        int pRes = m + n - 1;

        while (pNums1 >= 0 && pNums2 >= 0) {
            if (nums1[pNums1] > nums2[pNums2]) {
                nums1[pRes] = nums1[pNums1];
                pNums1--;
            } else {
                nums1[pRes] = nums2[pNums2];
                pNums2--;
            }
            pRes--;
        }
        while (pNums2 >= 0) {
            nums1[pRes] = nums2[pNums2];
            pNums2--;
            pRes--;
        }
    }
}
