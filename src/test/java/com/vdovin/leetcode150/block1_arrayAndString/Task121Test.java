package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task121Test {
    private Task121 task;

    @Before
    public void createNewTask() {
        task = new Task121();
    }

    @Test
    public void Test1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int res = task.maxProfit(prices);
        Assert.assertEquals(5, res);
    }
}
