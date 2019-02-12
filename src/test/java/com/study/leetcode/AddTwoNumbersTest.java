package com.study.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    public void addTwoNumbersTest() {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode listNode = AddTwoNumbers.addTwoNumbers(listNode1, listNode4);

        assertTrue(listNode.val == 7
                && listNode.next.val == 0
                && listNode.next.next.val == 8);
        // TODO: 2019-02-13 add case when only one element in input but sum more then 10
        // TODO: 2019-02-13 add case when inputs have different length
    }
}