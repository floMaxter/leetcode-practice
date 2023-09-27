package com.vdovin.leetcode150.block2_twoPointers;

import com.vdovin.leetcode150.block2_twoPointers.Task125;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task125Test {
    private Task125 task;
    @Before
    public void createNewTask() {
        task = new Task125();
    }

    @Test
    public void Test1() {
        String s = "A man, a plan, a canal: Panama";
        Assert.assertTrue(task.isPalindrome(s));
    }
}
