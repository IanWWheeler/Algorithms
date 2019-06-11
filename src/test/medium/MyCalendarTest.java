package test.medium;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import medium.MyCalendar;

public class MyCalendarTest {
	
	MyCalendar calendar;
	
	@Test
	public void testOne() {
		calendar = new MyCalendar();
		assertTrue(calendar.book(10, 20));
		assertFalse(calendar.book(15, 25));
		assertTrue(calendar.book(20, 30));
	}
	
	@Test
	public void testTwo() {
		calendar = new MyCalendar();
		assertTrue(calendar.book(10, 20));
		assertFalse(calendar.book(15, 25));
		assertTrue(calendar.book(20, 30));
		assertTrue(calendar.book(0, 10));
		assertFalse(calendar.book(2, 8));
		assertFalse(calendar.book(8, 9));
		assertFalse(calendar.book(0, 11));
		assertFalse(calendar.book(29, 31));
		assertTrue(calendar.book(30, 35));
	}
	
	
	@Test
	public void testThree() {
		calendar = new MyCalendar();
		assertTrue(calendar.book(47, 50));
		assertTrue(calendar.book(33, 41));
		assertFalse(calendar.book(39, 45));
		assertFalse(calendar.book(33, 42));
		assertTrue(calendar.book(25, 32));
		assertFalse(calendar.book(26, 35));
		assertTrue(calendar.book(19, 25));
		assertTrue(calendar.book(3, 8));
		assertTrue(calendar.book(8, 13));
		assertFalse(calendar.book(18, 27));
	}
}
