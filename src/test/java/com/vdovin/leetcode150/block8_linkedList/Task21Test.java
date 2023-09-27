package com.vdovin.leetcode150.block8_linkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.vdovin.leetcode150.block8_linkedList.Task21.*;

public class Task21Test {
    private Task21 task;
    private ListNode list1;
    private ListNode list2;
    private ListNode explList;

    @Before
    public void createNewTask() {
        task = new Task21();
    }

    @Test
    public void Test1() {
        createListNodeForTest1();
        Assert.assertEquals(listNodeToString(explList),
                listNodeToString(task.mergeTwoLists(list1, list2)));
    }

    public void createListNodeForTest1() {
        list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        explList = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4, null))))));
    }

    public String listNodeToString(ListNode list) {
        StringBuilder sb = new StringBuilder();
        while (list != null) {
            sb.append(list.val);
            list = list.next;
        }
        return sb.toString();
    }
}
