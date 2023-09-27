package com.vdovin.leetcode150.block5_hashmap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1Test {
    private Task1 task;

    @Before
    public void createNewTask() {
        task = new Task1();
    }

    @Test
    public void Test() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expRes = new int[]{1, 0};
        Assert.assertArrayEquals(expRes, task.twoSum(nums, target));
    }
}
