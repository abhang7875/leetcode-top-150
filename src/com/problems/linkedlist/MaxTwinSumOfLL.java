package com.problems.linkedlist;

public class MaxTwinSumOfLL {
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode last = slow.next;
        slow.next = null;
        ListNode curr = reverse(head);
        int output = 0;
        while (last != null) {
            output = Math.max(last.val + curr.val, output);
            curr = curr.next;
            last = last.next;
        }
        return output;
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
