package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task26Test {
    private Task26 task;
    private int[] nums;
    @Before
    public void createNewTask() {
        task = new Task26();
    }

    @Test
    public void Test1() {
        nums = new int[]{1, 1, 2};
        int res = task.removeDuplicates(nums);
        Assert.assertEquals(2, res);
    }
    @Test
    public void Test2() {
        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int res = task.removeDuplicates(nums);
        Assert.assertEquals(5, res);
    }
}
