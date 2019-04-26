package test.easy;

import org.junit.Test;
import org.junit.Assert;
import common.TreeNode;
import easy.MaximumDepthOfBinaryTree;

public class MaximumDeptOfBinaryTreeTest {
	
	MaximumDepthOfBinaryTree max = new MaximumDepthOfBinaryTree();

	@Test
	public void nullTest() {
		TreeNode root = null;
		int expected = 0;
		int actual = max.maxDepth(root);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void evenBranchesTest() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.right = new TreeNode(9);
		root.right.right = new TreeNode(8);
		int expected = 3;
		int actual = max.maxDepth(root);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void singleRootTest() {
		TreeNode root = new TreeNode(1);
		int expected = 1;
		int actual = max.maxDepth(root);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void oddBranchesTest() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.right = new TreeNode(9);
		root.right.right = new TreeNode(8);
		root.right.right.right = new TreeNode(10);
		int expected = 4;
		int actual = max.maxDepth(root);
		Assert.assertEquals(expected, actual);		
	}
	
}
