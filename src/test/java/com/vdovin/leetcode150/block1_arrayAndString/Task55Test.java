package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task55Test {
    private Task55 task;

    @Before
    public void createNewTask() {
        task = new Task55();
    }

    @Test
    public void Test() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        boolean res = task.canJump(nums);
        Assert.assertTrue(res);
    }
}
