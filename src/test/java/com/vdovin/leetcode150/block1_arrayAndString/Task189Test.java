package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task189Test {
    private Task189 task;

    @Before
    public void createNewTest() {
        task = new Task189();
    }

    @Test
    public void Test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] explainedRes = new int[]{5, 6, 7, 1, 2, 3, 4};
        task.rotate(nums, k);
        Assert.assertArrayEquals(explainedRes, nums);
    }
}
