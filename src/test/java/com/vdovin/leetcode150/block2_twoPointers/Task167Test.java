package com.vdovin.leetcode150.block2_twoPointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task167Test {
    private Task167 task;

    @Before
    public void createNewTask() {
        task = new Task167();
    }

    @Test
    public void Task1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expRes = new int[]{1, 2};
        Assert.assertArrayEquals(expRes, task.twoSum(nums, target));
    }
}
