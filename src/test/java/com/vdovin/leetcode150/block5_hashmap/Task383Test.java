package com.vdovin.leetcode150.block5_hashmap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task383Test {
    private Task383 task;
    @Before
    public void createNewTask() {
        task = new Task383();
    }

    @Test
    public void Test1() {
        String ransomNote = "aa";
        String magazine = "ab";
        Assert.assertFalse(task.canConstruct(ransomNote, magazine));
    }
}
