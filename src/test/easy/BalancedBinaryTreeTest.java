package test.easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.BalancedBinaryTree;

public class BalancedBinaryTreeTest {
	
	BalancedBinaryTree bbt = new BalancedBinaryTree();
	
	@Test
	public void balancedTreeByZero() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(3);
		
		Assert.assertEquals(true, bbt.isBalanced(root));
	}
	
	@Test
	public void unbalancedTreeByTwo() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(4);
		root.right.right.right.right = new TreeNode(5);
		
		Assert.assertEquals(false, bbt.isBalanced(root));
	}
	
	@Test
	public void balancedTreeByOne() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(4);
		
		Assert.assertEquals(false, bbt.isBalanced(root));
	}

}
