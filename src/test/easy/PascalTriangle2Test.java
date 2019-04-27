package test.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import easy.PascalsTriangle2;

public class PascalTriangle2Test {
	PascalsTriangle2 pt = new PascalsTriangle2();

	@Test
	public void noRowTest() {
		int rowIndex = -1;
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = pt.getRow(rowIndex);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void oneRowTest() {
		int rowIndex = 0;
		List<Integer> expected = createExpectedRow(rowIndex);
		List<Integer> actual = pt.getRow(rowIndex);
		for(int i = 0; i < actual.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void twoRowTest() {
		int rowIndex = 1;
		List<Integer> expected = createExpectedRow(rowIndex);
		List<Integer> actual = pt.getRow(rowIndex);
		for(int i = 0; i < actual.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void threeRowTest() {
		int rowIndex = 2;
		List<Integer> expected = createExpectedRow(rowIndex);
		List<Integer> actual = pt.getRow(rowIndex);
		for(int i = 0; i < actual.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void fourRowTest() {
		int rowIndex = 3;
		List<Integer> expected = createExpectedRow(rowIndex);
		List<Integer> actual = pt.getRow(rowIndex);
		for(int i = 0; i < actual.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void fiveRowTest() {
		int rowIndex = 4;
		List<Integer> expected = createExpectedRow(rowIndex);
		List<Integer> actual = pt.getRow(rowIndex);
		for(int i = 0; i < actual.size(); i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	/*
	 * Manually build Pascal Triangle up to 5 rows
	 */
	private List<Integer> createExpectedRow(int rowIndex) {
		List<Integer> row = new ArrayList<Integer>();

		if(rowIndex == 0) {
			row.add(1);
			return row;
		}
		if(rowIndex == 1) {
			row.add(1);
			row.add(1);
			return row;
		}
		if(rowIndex == 2) {
			row.add(1);
			row.add(2);
			row.add(1);
			return row;
		}
		if(rowIndex == 3) {
			row.add(1);
			row.add(3);
			row.add(3);
			row.add(1);
			return row;
		}
		if(rowIndex == 4) {
			row.add(1);
			row.add(4);
			row.add(6);
			row.add(4);
			row.add(1);
			return row;
		}
		return new ArrayList<Integer>();
	}
}
