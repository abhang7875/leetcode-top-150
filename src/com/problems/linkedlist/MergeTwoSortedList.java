package com.problems.linkedlist;

//Problem - 21
public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode head = new ListNode(0), curr = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (curr == null) {
                    curr = new ListNode(list1.val);
                    head.next = curr;
                } else {
                    curr.next = new ListNode(list1.val);
                    curr = curr.next;
                }
                list1 = list1.next;
            } else {
                if (curr == null) {
                    curr = new ListNode(list2.val);
                    head.next = curr;
                } else {
                    curr.next = new ListNode(list2.val);
                    curr = curr.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 == null)
            curr.next = list2;
        if (list2 == null)
            curr.next = list1;

        return head.next;
    }
}
