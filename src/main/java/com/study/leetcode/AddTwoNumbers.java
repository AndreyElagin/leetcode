package com.study.leetcode;

import java.util.Stack;

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
        Stack<Integer> nodes1 = new Stack<>();
        Stack<Integer> nodes2 = new Stack<>();

        fillStack(l1, nodes1);
        fillStack(l2, nodes2);

        int reminder = 0;
        int firstNodeValue = nodes1.pop() + nodes2.pop();
        ListNode firstNode;

        if (firstNodeValue > 9) {
            firstNode = new ListNode(firstNodeValue - 10);
            reminder = 1;
        } else {
            firstNode = new ListNode(firstNodeValue);
        }

        ListNode listNode = firstNode;

        do {
            if (nodes1.isEmpty() || nodes2.isEmpty()) {
                if (reminder > 0) {
                    listNode.next = new ListNode(reminder);
                }
                break;
            }
            ListNode next;

            int value = nodes1.pop() + nodes2.pop() + reminder;
            reminder = 0;
            if (value > 9) {
                next = new ListNode(value - 10);
                listNode.next = next;
                listNode = next;
                reminder = 1;
            } else {
                next = new ListNode(value);
                listNode.next = next;
                listNode = next;
            }
        } while (!nodes1.isEmpty() && !nodes2.isEmpty());

        return firstNode;
    }

    private static void fillStack(ListNode listNode, Stack<Integer> stack) {
        do {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (listNode != null);
    }
}

class ListNode {
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
