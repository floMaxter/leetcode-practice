package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task28Test {
    private Task28 task;
    @Before
    public void createNewTask() {
        task = new Task28();
    }

    @Test
    public void Test1() {
        String needle = "sad";
        String haystack = "sadbutsad";
        Assert.assertEquals(0, task.strStr(haystack, needle));
    }
}
