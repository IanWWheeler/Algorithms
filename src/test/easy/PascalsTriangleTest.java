package test.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import easy.PascalsTriangle;

public class PascalsTriangleTest {

	PascalsTriangle pt = new PascalsTriangle();

	@Test
	public void noRowTest() {
		int numRows = 0;
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		List<List<Integer>> actual = pt.generate(numRows);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void oneRowTest() {
		int numRows = 1;
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		ArrayList<Integer> expectedRow = new ArrayList<Integer>();
		expectedRow.add(1);
		expected.add(0, expectedRow);
		List<List<Integer>> actual = pt.generate(numRows);
		for(int i = 0; i < numRows; i++) {
			ArrayList<Integer> aList = (ArrayList<Integer>) actual.get(i);
			ArrayList<Integer> eList = (ArrayList<Integer>) expected.get(i);
			for(int j = 0; j < aList.size(); j++) {
				Assert.assertEquals(eList.get(j), aList.get(j));
			}
		}
	}
	
	@Test
	public void twoRowTest() {
		int numRows = 2;
		List<List<Integer>> expected = createExpectedPascalTriangle(numRows);
		List<List<Integer>> actual = pt.generate(numRows);
		for(int i = 0; i < numRows; i++) {
			ArrayList<Integer> aList = (ArrayList<Integer>) actual.get(i);
			ArrayList<Integer> eList = (ArrayList<Integer>) expected.get(i);
			for(int j = 0; j < aList.size(); j++) {
				Assert.assertEquals(eList.get(j), aList.get(j));
			}
		}
	}
	
	@Test
	public void threeRowTest() {
		int numRows = 3;
		List<List<Integer>> expected = createExpectedPascalTriangle(numRows);
		List<List<Integer>> actual = pt.generate(numRows);
		for(int i = 0; i < numRows; i++) {
			ArrayList<Integer> aList = (ArrayList<Integer>) actual.get(i);
			ArrayList<Integer> eList = (ArrayList<Integer>) expected.get(i);
			for(int j = 0; j < aList.size(); j++) {
				Assert.assertEquals(eList.get(j), aList.get(j));
			}
		}
	}
	
	@Test
	public void fourRowTest() {
		int numRows = 4;
		List<List<Integer>> expected = createExpectedPascalTriangle(numRows);
		List<List<Integer>> actual = pt.generate(numRows);
		for(int i = 0; i < numRows; i++) {
			ArrayList<Integer> aList = (ArrayList<Integer>) actual.get(i);
			ArrayList<Integer> eList = (ArrayList<Integer>) expected.get(i);
			for(int j = 0; j < aList.size(); j++) {
				Assert.assertEquals(eList.get(j), aList.get(j));
			}
		}
	}
	
	@Test
	public void fiveRowTest() {
		int numRows = 5;
		List<List<Integer>> expected = createExpectedPascalTriangle(numRows);
		List<List<Integer>> actual = pt.generate(numRows);
		for(int i = 0; i < numRows; i++) {
			ArrayList<Integer> aList = (ArrayList<Integer>) actual.get(i);
			ArrayList<Integer> eList = (ArrayList<Integer>) expected.get(i);
			for(int j = 0; j < aList.size(); j++) {
				Assert.assertEquals(eList.get(j), aList.get(j));
			}
		}
	}
	
	/*
	 * Manually build Pascal Triangle up to 5 rows
	 */
	private List<List<Integer>> createExpectedPascalTriangle(int numRows) {
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		
		if(numRows >= 1) {
			List<Integer> rowOne = new ArrayList<Integer>();
			rowOne.add(1);
			expectedList.add(rowOne);
		}
		if(numRows >= 2) {
			List<Integer> rowTwo = new ArrayList<Integer>();
			rowTwo.add(1);
			rowTwo.add(1);
			expectedList.add(rowTwo);
		}
		if(numRows >= 3) {
			List<Integer> rowThree = new ArrayList<Integer>();
			rowThree.add(1);
			rowThree.add(2);
			rowThree.add(1);
			expectedList.add(rowThree);
		}
		if(numRows >= 4) {
			List<Integer> rowFour = new ArrayList<Integer>();
			rowFour.add(1);
			rowFour.add(3);
			rowFour.add(3);
			rowFour.add(1);
			expectedList.add(rowFour);
		}
		if(numRows == 5) {
			List<Integer> rowFive = new ArrayList<Integer>();
			rowFive.add(1);
			rowFive.add(4);
			rowFive.add(6);
			rowFive.add(4);
			rowFive.add(1);
			expectedList.add(rowFive);
		}	
		return expectedList;
	}

}
