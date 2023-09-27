package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task58Test {
    private Task58 task;
    @Before
    public void createNewTask() {
        task = new Task58();
    }
    @Test
    public void Test() {
        String s = "Hello World";
        Assert.assertEquals(5, task.lengthOfLastWord(s));
    }
}
