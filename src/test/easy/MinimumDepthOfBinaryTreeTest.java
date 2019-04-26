package test.easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.MinimumDepthOfBinaryTree;

public class MinimumDepthOfBinaryTreeTest {
	
	MinimumDepthOfBinaryTree min = new MinimumDepthOfBinaryTree();
	
	@Test
	public void nullTest() {
		TreeNode root = null;
		int expected = 0;
		int actual = min.minDepth(root);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void evenTest() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		int expected = 3;
		int actual = min.minDepth(root);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void oddTest() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.right = new TreeNode(2);
		int expected = 2;
		int actual = min.minDepth(root);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void singleTest() {
		TreeNode root = new TreeNode(1);
		int expected = 1;
		int actual = min.minDepth(root);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void oddTwoTest() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(2);
		int expected = 2;
		int actual = min.minDepth(root);
		Assert.assertEquals(expected, actual);
	}

}
