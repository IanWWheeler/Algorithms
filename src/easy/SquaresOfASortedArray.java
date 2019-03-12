package easy;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfASortedArray {
	
	 public int[] sortedSquares(int[] A) {
		 if(A == null) return new int[] {0};
		 int[] sorted = new int[A.length];
		 // find square of every value in A
		 for(int i = 0; i < A.length; i++) {
			 sorted[i] = A[i] * A[i];
		 }
		 Arrays.sort(sorted);
		 return sorted;
	 }
}
