package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task88Test {
    private Task88 task;

    @Before
    public void createNewTask() {
        task = new Task88();
    }

    @Test
    public void Test1() {
        int[] nums1 = new int[]{1, 3, 5, 0, 0, 0};
        int[] nums2 = new int[]{2, 4, 6};
        int m = 3, n = 3;
        task.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    public void Test2() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int m = 1, n = 0;
        task.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(new int[]{1}, nums1);
    }
}
