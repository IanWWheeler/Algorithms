package medium;

import common.ListNode;

/*
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */

public class SwapNodesinPairs {

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode temp = head;
		ListNode tempNext = head.next.next;
		head = head.next;
		head.next = temp;
		head.next.next = swapPairs(tempNext);
		return head;
	}
}
