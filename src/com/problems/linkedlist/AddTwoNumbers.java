package com.problems.linkedlist;

//Problem - 2
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        int carry = 0;
        ListNode head = new ListNode(0), curr = null;
        while (l1 != null && l2 != null) {
            int sum = (l1.val + l2.val + carry);
            if (sum >= 10) carry = 1;
            else carry = 0;
            sum %= 10;
            if (curr == null) {
                curr = new ListNode(sum);
                head.next = curr;
            } else {
                curr.next = new ListNode(sum);
                curr = curr.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = (l1.val + carry);
            if (sum >= 10) carry = 1;
            else carry = 0;
            sum %= 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = (l2.val + carry);
            if (sum >= 10) carry = 1;
            else carry = 0;
            sum %= 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            l2 = l2.next;
        }
        if (carry == 1) curr.next = new ListNode(1);

        return head.next;
    }
}
