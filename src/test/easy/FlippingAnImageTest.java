package test.easy;

import org.junit.Test;
import org.junit.Assert;

import easy.FlippingAnImage;

public class FlippingAnImageTest {
	
	FlippingAnImage fi = new FlippingAnImage();
	
	@Test
	public void nullTest() {
		int[][] A = null;
		int[][] expected = null;
		int[][] actual = fi.flipAndInvertImage(A);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void emptyTest() {
		int[][] A = new int[0][0];
		int[][] expected = null;
		int[][] actual = fi.flipAndInvertImage(A);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void positiveOneTest() {
		int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
		int[][] expected = {{1,0,0,},{0,1,0},{1,1,1}};
		int[][] actual = fi.flipAndInvertImage(A);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void positiveTwoTest() {
		int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int[][] expected = {{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}};
		int[][] actual = fi.flipAndInvertImage(A);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void overSizedTest() {
		int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,2},{1,0,1,0}};
		int[][] expected = null;
		int[][] actual = fi.flipAndInvertImage(A);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void underSizedTest() {
		int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,-1},{1,0,1,0}};
		int[][] expected = null;
		int[][] actual = fi.flipAndInvertImage(A);
		Assert.assertArrayEquals(expected, actual);
	}
	
	

}
