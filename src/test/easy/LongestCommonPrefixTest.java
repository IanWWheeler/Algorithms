package test.easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LongestCommonPrefix;


public class LongestCommonPrefixTest {
	
	LongestCommonPrefix lcp = new LongestCommonPrefix();
	
	@Test
	public void postiveTestOne() {
		String[] strs = new String[]{"flower","flow","flight"};
		String expected = "fl";
		Assert.assertEquals(expected, lcp.longestCommonPrefix(strs));
	}
	
	@Test
	public void noMatchTest() {
		String[] strs = new String[] {"dog","racecar","car"};
		String expected = "";
		Assert.assertEquals(expected, lcp.longestCommonPrefix(strs));
	}
	
	@Test
	public void nullTest() {
		String[] strs = null;
		String expected = "";
		Assert.assertEquals(expected, lcp.longestCommonPrefix(strs));
	}

}
