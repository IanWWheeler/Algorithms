package test.medium;

import org.junit.Test;

import common.ListNode;
import org.junit.Assert;
import medium.SwapNodesinPairs;

public class SwapNodesinPairsTest {
	
	private SwapNodesinPairs swap = new SwapNodesinPairs();

	@Test
	public void positiveTest() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		ListNode expected = new ListNode(2);
		expected.next = new ListNode(1);
		expected.next.next = new ListNode(4);
		expected.next.next.next = new ListNode(3);
		
		ListNode actual = swap.swapPairs(head);
		compareLinkedLists(actual, expected);
	}
	
	@Test
	public void oddListTest() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		
		ListNode expected = new ListNode(2);
		expected.next = new ListNode(1);
		expected.next.next = new ListNode(3);
		
		ListNode actual = swap.swapPairs(head);
		compareLinkedLists(actual, expected);
	}
		
	@Test
	public void nullTest() {
		ListNode head = null;
		ListNode expected = null;
		ListNode actual = swap.swapPairs(head);
		compareLinkedLists(actual, expected);
	}
	
	/**
	 * Compare actual results from Linked List with Expected output
	 * All errors will generate from this method
	 * @param actual
	 * @param expected
	 */
	private void compareLinkedLists(ListNode actual, ListNode expected) {
		while(actual != null) {
			if(expected.val != actual.val) {
				Assert.fail("Actual and Expected Linked Lists do not match.");
			} else {
				actual = actual.next;
				expected = expected.next;
			}
		}
		// Actual has reached its tail, but check expected to make sure it has
		if(expected != null) Assert.fail("Actual Linked List was smaller than Expected output.");
	}	

}
