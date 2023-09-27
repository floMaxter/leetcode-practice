package com.vdovin.leetcode150.block2_twoPointers;

import com.vdovin.leetcode150.block2_twoPointers.Task392;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task392Test {
    private Task392 task;
    @Before
    public void createNewTask() {
        task = new Task392();
    }

    @Test
    public void Test() {
        String s = "abc";
        String t = "ahbgdc";
        Assert.assertTrue(task.isSubsequence(s, t));
    }
}
