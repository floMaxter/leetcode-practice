package com.vdovin.leetcode150.block2_twoPointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task11Test {
    private Task11 task;

    @Before
    public void createNewTask() {
        task = new Task11();
    }

    @Test
    public void Test1() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(49, task.maxArea(height));
    }
}
