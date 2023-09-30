package com.vdovin.different_topic.searching.binary_search;

import com.vdovin.different_topics.searching.binary_search.Task69;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task69Test {
    private Task69 task;

    @Before
    public void createNewTask() {
        task = new Task69();
    }

    @Test
    public void Test1() {
        Assert.assertEquals(2, task.mySqrt(4));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(2, task.mySqrt(8));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(46339, task.mySqrt(2147395599));
    }
}
