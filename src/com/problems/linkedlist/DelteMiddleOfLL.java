package com.problems.linkedlist;

public class DelteMiddleOfLL {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
            slow.next = null;
        }

        return head;
    }
}
