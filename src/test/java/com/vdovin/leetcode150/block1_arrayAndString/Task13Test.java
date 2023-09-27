package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task13Test {
    private Task13 task;
    @Before
    public void createNewTask() {
        task = new Task13();
    }

    @Test
    public void Test() {
        String s = "III";
        int res = task.romanToInt(s);
        Assert.assertEquals(3, res);
    }
}
