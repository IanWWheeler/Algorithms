package test.easy;

import org.junit.Assert;
import org.junit.Test;

import easy.MajorityElement;

public class MajorityElementTest {
	
	MajorityElement me = new MajorityElement();
	
	@Test
	public void oddTest() {
		int[] nums = new int[] {3,2,3};
		int expected = 3;
		int actual = me.majorityElement(nums);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void evenTest() {
		int[] nums = new int[] {3,2,2,3};
		int expected = 3; // it will round up
		int actual = me.majorityElement(nums);
		Assert.assertEquals(expected, actual);
	}

}
