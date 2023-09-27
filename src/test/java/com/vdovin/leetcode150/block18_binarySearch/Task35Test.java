package com.vdovin.leetcode150.block18_binarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task35Test {
    private Task35 task;

    @Before
    public void createNewTask() {
        task = new Task35();
    }

    @Test
    public void Test1() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        Assert.assertEquals(2, task.searchInsert(nums, target));
    }
}
