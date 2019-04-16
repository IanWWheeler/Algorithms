package test.easy;

import org.junit.Assert;
import org.junit.Test;

import easy.ReverseStringIterative;

public class ReverseStringIterativeTest {

ReverseStringIterative rs = new ReverseStringIterative();
	
	@Test
	public void postiveTestOdd() {
		char[] s = new char[] {'h', 'e', 'l', 'l', 'o'};
		char[] expected = new char[] {'o', 'l', 'l', 'e', 'h'};
		char[] actual = rs.reverseString(s);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void postiveTestEven() {
		char[] s =  new char [] {'b', 'o', 'a', 't'};
		char[] expected = new char[] {'t', 'a', 'o', 'b'};
		char[] actual = rs.reverseString(s);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void emptyTest() {
		char[] s = new char[] {};
		char [] expected = new char[] {};
		char[] actual = rs.reverseString(s);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void nullTest() {
		char[] s = null;
		char[] expected = null;
		char[] actual = rs.reverseString(s);
		Assert.assertArrayEquals(expected, actual);
	}
}
