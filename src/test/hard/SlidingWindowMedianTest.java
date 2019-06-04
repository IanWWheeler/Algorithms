package test.hard;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import hard.SlidingWindowMedian;

public class SlidingWindowMedianTest {
	
	SlidingWindowMedian swm;
	int[] testNums = {1,  3,  -1, -3,  5,  3,  6,  7 };
	
	@Test
	public void testTwo() {
		int k = 2;
		double[] expectedMedians = {2, 1, -2, 1, 4, 4.5, 6.5};
		swm = new SlidingWindowMedian();
		double[] actualMedians = swm.medianSlidingWindow(testNums, k);
		Assert.assertTrue(Arrays.equals(expectedMedians, actualMedians));
	}
	
	@Test
	public void testThree() {
		int k = 3;
		double[] expectedMedians = {1, -1, -1, 3, 5, 6 };
		swm = new SlidingWindowMedian();
		double[] actualMedians = swm.medianSlidingWindow(testNums, k);
		Assert.assertTrue(Arrays.equals(expectedMedians, actualMedians));
	}
	
	
	
	@Test
	public void testFour() {
		int k = 4;
		double[] expectedMedians = {0, 1, 1, 4, 5.5};
		swm = new SlidingWindowMedian();
		double[] actualMedians = swm.medianSlidingWindow(testNums, k);
		Assert.assertTrue(Arrays.equals(expectedMedians, actualMedians));
	}
	
	@Test
	public void testFive() {
		int k = 5;
		double[] expectedMedians = {1, 3, 3, 5};
		swm = new SlidingWindowMedian();
		double[] actualMedians = swm.medianSlidingWindow(testNums, k);
		Assert.assertTrue(Arrays.equals(expectedMedians, actualMedians));
	}
	
	@Test
	public void testLeetCodeFailureOne() {
		int k = 2;
		int[] testNums = {2147483647, 2147483647};
		double[] expectedMedians = {2147483647.0};
		swm = new SlidingWindowMedian();
		double[] actualMedians = swm.medianSlidingWindow(testNums, k);
		Assert.assertTrue(Arrays.equals(expectedMedians, actualMedians));
	}
	
	@Test
	public void nullTest() {
		int k = 1;
		int[] nullNums = null;
		double[] expectedMedians = null;
		swm = new SlidingWindowMedian();
		double[] actualMedians = swm.medianSlidingWindow(nullNums, k);
		Assert.assertTrue(Arrays.equals(expectedMedians, actualMedians));
	}

}
