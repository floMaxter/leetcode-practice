package com.vdovin.different_topics.linked_list;

import com.vdovin.leetcode150.block8_linkedList.Task141;

import java.util.HashSet;

public class Task142 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) {
                return head;
            }
            hashSet.add(head);
            head = head.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        System.out.println(detectCycle(head));
    }
}
