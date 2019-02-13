package com.study.leetcode;

/**
 * You are given two non-empty linked lists representing
 * two non-negative integers. The digits are stored in
 * reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode first = l1;
        ListNode second = l2;
        ListNode curr = head;
        int reminder = 0;

        while (first != null || second != null) {
            int val1 = first != null ? first.val : 0;
            int val2 = second != null ? second.val : 0;

            first = first != null ? first.next : null;
            second = second != null ? second.next : null;

            int sum = val1 + val2 + reminder;
            reminder = sum > 9 ? 1 : 0;
            ListNode next = new ListNode(sum % 10);
            curr.next = next;
            curr = next;
        }
        if (reminder > 0) {
            curr.next = new ListNode(reminder);
        }

        return head.next;
    }
}

class ListNode {
    
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
