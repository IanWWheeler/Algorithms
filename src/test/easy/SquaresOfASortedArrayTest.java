package test.easy;

import org.junit.Assert;
import org.junit.Test;

import easy.SquaresOfASortedArray;

public class SquaresOfASortedArrayTest {
	
	SquaresOfASortedArray sortArray = new SquaresOfASortedArray();
	
	@Test
	public void cleanArraySortTest() {
		int[] a = {6,5,4,3,2,1};
		int[] expectedAns = {1,4,9,16,25,36};
		int[] ans = sortArray.sortedSquares(a);
		Assert.assertArrayEquals(expectedAns, ans);
	}
	
	@Test
	public void nullArraySortTest() {
		int[] a = null;
		int[] expectedAns = {0};
		int[] ans = sortArray.sortedSquares(a);
		Assert.assertArrayEquals(expectedAns, ans);
	}
	
	@Test
	public void sameArraySortTest() {
		int[] a = {5,5,5,5,5,5,5,5,5,5,5,5,5};
		int[] expectedAns = {25, 25, 25,  25, 25, 25, 25, 25, 25, 25, 25, 25, 25};
		int[] ans = sortArray.sortedSquares(a);
		Assert.assertArrayEquals(expectedAns, ans);
	}

}
