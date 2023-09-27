package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task122Test {
    private Task122 task;
    @Before
    public void createNewTask() {
        task = new Task122();
    }

    @Test
    public void Test1() {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(4, task.maxProfit(prices));
    }

    @Test
    public void Test2() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        Assert.assertEquals(7, task.maxProfit(prices));
    }
}
