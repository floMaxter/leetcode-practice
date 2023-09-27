package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task169Test {
    private Task169 task169;
    @Before
    public void createNewTask() {
        task169 = new Task169();
    }

    @Test
    public void Test1() {
        int[] nums = new int[]{3, 2, 3};
        int res = task169.majorityElement(nums);
        Assert.assertEquals(3, res);
    }
}
