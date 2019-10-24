package com.leetcode.algorithm.medium;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rstHeadNode = new ListNode(0);
        int carry = 0;

        ListNode headNode1 = l1;
        ListNode headNode2 = l2;
        ListNode rstNode = rstHeadNode;
        while(headNode1 != null || headNode2 != null) {
            int val1, val2;
            if (headNode1 != null) {
                val1 = headNode1.val;
                headNode1 = headNode1.next;
            } else {
                val1 = 0;
                headNode1 = null;
            }

            if (headNode2 != null) {
                val2 = headNode2.val;
                headNode2 = headNode2.next;
            } else {
                val2 = 0;
                headNode2 = null;
            }
            int sum = val1 + val2 + carry;
            int remainder = sum % 10;
            rstNode.val = remainder;
            carry = sum / 10;
            if(headNode1 != null || headNode2 != null || carry != 0) {
                rstNode = rstNode.next = new ListNode(carry);
            }
        }
        return rstHeadNode;
    }
}
