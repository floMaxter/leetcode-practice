package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task80Test {
    private Task80 task;
    @Before
    public void createNewTask() {
        task = new Task80();
    }

    @Test
    public void Test1() {
        int[] nums = new int[]{1,1,1,2,2,3};
        int res = task.removeDuplicates(nums);
        Assert.assertEquals(5, res);
    }
}
