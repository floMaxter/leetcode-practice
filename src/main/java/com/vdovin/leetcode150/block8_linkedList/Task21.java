package com.vdovin.leetcode150.block8_linkedList;

public class Task21 {
    //Time: O(list1.length() + list2.length())
    //Space: O(max(list1.length, list2.length()))
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode resListNode = new ListNode();
        ListNode currListNode = resListNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currListNode.next = list1;
                list1 = list1.next;
            } else {
                currListNode.next = list2;
                list2 = list2.next;
            }
            currListNode = currListNode.next;
        }
        currListNode.next = (list1 == null) ? list2 : list1;

        return resListNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
}
