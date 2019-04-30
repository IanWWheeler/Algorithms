package test.medium;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import common.ListNode;
import medium.AddTwoNumbers;

public class AddTwoNumberTest {
	
	AddTwoNumbers atn = new AddTwoNumbers();
	
	@Test
	public void oneNumWithoutRemainderTest() {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode actual = atn.addTwoNumbers(l1, l2);
		ListNode expected = new ListNode(6);
		
		if(actual == null) fail("Actual value is null.");
		while(expected != null || actual != null) {
			Assert.assertEquals(expected.val, actual.val);
			expected = expected.next;
			actual = actual.next;
		}
	}
	
	@Test
	public void oneNumWithRemainderTest() {
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(9);
		
		ListNode actual = atn.addTwoNumbers(l1, l2);
		ListNode expected = new ListNode(8);
		expected.next = new ListNode(1);
		
		if(actual == null) fail("Actual value is null.");
		while(expected != null || actual != null) {
			Assert.assertEquals(expected.val, actual.val);
			expected = expected.next;
			actual = actual.next;
		}
	}
	
	@Test
	public void twoNumWithoutRemainderTest() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(4);
		l2.next = new ListNode(5);
		l2.next.next = new ListNode(6);
		
		ListNode actual = atn.addTwoNumbers(l1, l2);
		ListNode expected = new ListNode(5);
		expected.next = new ListNode(7);
		expected.next.next = new ListNode(9);
		
		if(actual == null) fail("Actual value is null.");
		while(expected != null || actual != null) {
			Assert.assertEquals(expected.val, actual.val);
			expected = expected.next;
			actual = actual.next;
		}
	}
	
	@Test
	public void fivefiveTest() {
		ListNode l1 = new ListNode(5);		
		ListNode l2 = new ListNode(5);
		ListNode actual = atn.addTwoNumbers(l1, l2);
		ListNode expected = new ListNode(0);
		expected.next = new ListNode(1);
		
		if(actual == null) fail("Actual value is null.");
		while(expected != null || actual != null) {
			Assert.assertEquals(expected.val, actual.val);
			expected = expected.next;
			actual = actual.next;
		}
	}
	
	@Test
	public void unevenTest() {
		ListNode l1 = new ListNode(1);		
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		ListNode actual = atn.addTwoNumbers(l1, l2);
		ListNode expected = new ListNode(0);
		expected.next = new ListNode(0);
		expected.next.next = new ListNode(1);
		
		if(actual == null) fail("Actual value is null.");
		while(expected != null || actual != null) {
			Assert.assertEquals(expected.val, actual.val);
			expected = expected.next;
			actual = actual.next;
		}
	}

}
