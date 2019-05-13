package test.medium;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

import common.TreeNode;

import medium.BinaryTreeLevelOrderTraversal;

public class BinaryTreeLevelOrderTraversalTest {
	
	BinaryTreeLevelOrderTraversal bt = new BinaryTreeLevelOrderTraversal();
	
	@Test
	public void nullTest() {
		TreeNode root = null;
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		List<List<Integer>> actual = bt.levelOrder(root);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void singleRowTest() {
		TreeNode root = new TreeNode(1);
		List<List<Integer>> actual = bt.levelOrder(root);
		if(actual.size() == 0) fail("Actual value is null.");
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		List<Integer> rowOne = new ArrayList<Integer>(Arrays.asList(1)) ;
		expected.add(0, rowOne);
		
		for(int i = 0; i < actual.size(); i++) {
			List<Integer> actualRow = actual.get(i);
			List<Integer> expectedRow = expected.get(i);
			for(int j = 0; j < actualRow.size(); j++) {
				int e = expectedRow.get(j);
				int a = actualRow.get(j);
				Assert.assertEquals(e, a);
			}
		}	
	}
	
	@Test
	public void twoRowTest() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		List<List<Integer>> actual = bt.levelOrder(root);
		if(actual.size() == 0) fail("Actual value is null.");
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>(Arrays.asList(1)) ;
		expected.add(0, row);
		row = new ArrayList<Integer>(Arrays.asList(2, 3));
		expected.add(1, row);
		for(int i = 0; i < actual.size(); i++) {
			List<Integer> actualRow = actual.get(i);
			List<Integer> expectedRow = expected.get(i);
			for(int j = 0; j < actualRow.size(); j++) {
				int e = expectedRow.get(j);
				int a = actualRow.get(j);
				Assert.assertEquals(e, a);
			}
		}	
	}
	
	@Test
	public void threeRowTest() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		List<List<Integer>> actual = bt.levelOrder(root);
		if(actual.size() == 0) fail("Actual value is null.");
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>(Arrays.asList(1)) ;
		expected.add(0, row);
		row = new ArrayList<Integer>(Arrays.asList(2, 3));
		expected.add(1, row);
		row = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7));
		expected.add(2, row);
		for(int i = 0; i < actual.size(); i++) {
			List<Integer> actualRow = actual.get(i);
			List<Integer> expectedRow = expected.get(i);
			for(int j = 0; j < actualRow.size(); j++) {
				int e = expectedRow.get(j);
				int a = actualRow.get(j);
				Assert.assertEquals(e, a);
			}
		}	
	}

}
