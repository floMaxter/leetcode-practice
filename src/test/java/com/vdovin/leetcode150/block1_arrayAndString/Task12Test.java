package com.vdovin.leetcode150.block1_arrayAndString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task12Test {
    private Task12 task;
    @Before
    public void createNewTask() {
        task = new Task12();
    }

    @Test
    public void Test1() {
        Assert.assertEquals("III", task.intToRoman(3));
    }
    @Test
    public void Test2() {
        Assert.assertEquals("LVIII", task.intToRoman(58));
    }
}
