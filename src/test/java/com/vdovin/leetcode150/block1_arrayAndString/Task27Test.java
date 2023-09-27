package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task27Test {
    private Task27 task;
    private int[] nums;

    @Before
    public void createNewTask() {
        task = new Task27();
    }

    @Test
    public void Test1() {
        nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int res = task.removeElement(nums, val);
        Assert.assertEquals(2, res);
    }

    @Test
    public void Test2() {
        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int res = task.removeElement(nums, val);
        Assert.assertEquals(5, res);
    }
}
