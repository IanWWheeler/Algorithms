package medium;

import common.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
*/

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int rem = 0;
		while(l1 != null || l2 != null) {
			l1 = l1 == null ? new ListNode(0) : l1;
			l2 = l2 == null ? new ListNode(0) : l2;
			int sum = l1.val + l2.val + rem;
			tail.next = new ListNode(sum % 10);
			rem = sum / 10;
			l1 = l1.next;
			l2 = l2.next;
			tail = tail.next;
		}
		if(rem > 0) {
			tail.next = new ListNode(rem);
		}
		return head.next;
    }
}
