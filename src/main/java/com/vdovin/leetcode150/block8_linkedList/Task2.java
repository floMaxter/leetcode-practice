package com.vdovin.leetcode150.block8_linkedList;

public class Task2 {
    public static class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int transfer = 0;

        while (l1 != null || l2 != null || transfer != 0) {
            int digit1 = (l1 == null) ? 0 : l1.val;
            int digit2 = (l2 == null) ? 0 : l2.val;

            int sum = digit1 + digit2 + transfer;
            int digit = sum % 10;
            transfer = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode res = dummyHead.next;
        dummyHead.next = null;

        return dummyHead;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }



    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        printList(addTwoNumbers(l1, l2));
    }
    public static void printList(ListNode head) {
       ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
