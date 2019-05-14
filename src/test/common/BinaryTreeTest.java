package test.common;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import common.BinaryTree;
import common.TreeNode;

public class BinaryTreeTest {
	
	@Test
	public void buildSingleRowTest() {
		int[] nums = {1};
		TreeNode actual = BinaryTree.build(nums);
		TreeNode expected = new TreeNode(1);
		compareBinaryTree(expected, actual);
	}
	
	@Test
	public void buildTwoRowsTest() {
		int[] nums = {1, 2, 3};
		TreeNode actual = BinaryTree.build(nums);
		TreeNode expected = new TreeNode(1);
		expected.left = new TreeNode(2);
		expected.right = new TreeNode(3);
		compareBinaryTree(expected, actual);
	}
	
	@Test
	public void buildTwoRowsUnevenTest() {
		int[] nums = {1, 2};
		TreeNode actual = BinaryTree.build(nums);
		TreeNode expected = new TreeNode(1);
		expected.left = new TreeNode(2);
		compareBinaryTree(expected, actual);
	}
	
	@Test
	public void buildThreeRowsEvenTest() {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		TreeNode actual = BinaryTree.build(nums);
		TreeNode expected = new TreeNode(1);
		expected.left = new TreeNode(2);
		expected.right = new TreeNode(3);
		expected.left.left = new TreeNode(4);
		expected.left.right = new TreeNode(5);
		expected.right.left = new TreeNode(6);
		expected.right.right = new TreeNode(7);
		compareBinaryTree(expected, actual);
	}
	
	@Test
	public void buildThreeRowsUnevenTest() {
		Integer[] nums = {1, 2, 3, 4, null, 6, 7};
		TreeNode actual = BinaryTree.build(nums);
		TreeNode expected = new TreeNode(1);
		expected.left = new TreeNode(2);
		expected.right = new TreeNode(3);
		expected.left.left = new TreeNode(4);
		expected.left.right = null;
		expected.right.left = new TreeNode(6);
		expected.right.right = new TreeNode(7);
		compareBinaryTree(expected, actual);
	}
	
	
	private void compareBinaryTree(TreeNode expected, TreeNode actual) {
		if(expected == null && actual == null) return; // expected end
		if(expected == null || actual == null) { 
			fail("Expected or Actual contains null value when a value was expected for both.");
		}
		
		Assert.assertEquals(expected.val, actual.val);
		compareBinaryTree(expected.left, actual.left);
		compareBinaryTree(expected.right, actual.right);
	}
}
