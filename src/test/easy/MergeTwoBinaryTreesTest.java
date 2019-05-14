package test.easy;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import common.BinaryTree;
import common.TreeNode;
import easy.MergeTwoBinaryTrees;

public class MergeTwoBinaryTreesTest {

	MergeTwoBinaryTrees bt = new MergeTwoBinaryTrees();

	@Test
	public void nullTest() {
		int[] nums1 = null;
		int[] nums2 = null;
		TreeNode t1 = BinaryTree.build(nums1);
		TreeNode t2 = BinaryTree.build(nums2);
		TreeNode actual = bt.mergeTrees(t1, t2);
		TreeNode expected = null;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void oneRowTreeTest() {
		int[] nums1 = { 1 };
		int[] nums2 = { 2 };
		TreeNode t1 = BinaryTree.build(nums1);
		TreeNode t2 = BinaryTree.build(nums2);
		TreeNode actual = bt.mergeTrees(t1, t2);
		TreeNode expected = new TreeNode(3);
		if (actual == null)
			fail("Actual is null when at least one Node was expected.");
		testBinaryTree(expected, actual, true);
	}

	@Test
	public void twoRowTreeTest() {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 2, 3, 4 };
		TreeNode t1 = BinaryTree.build(nums1);
		TreeNode t2 = BinaryTree.build(nums2);
		TreeNode actual = bt.mergeTrees(t1, t2);
		TreeNode expected = new TreeNode(3);
		expected.left = new TreeNode(5);
		expected.right = new TreeNode(4);
		if (actual == null)
			fail("Actual is null when at least one Node was expected.");
		testBinaryTree(expected, actual, true);
	}

	@Test
	public void threeRowTreeTest() {
		int[] nums1 = { 1, 2, 3, 5 };
		Integer[] nums2 = { 2, 3, 4, null, 6 };
		TreeNode t1 = BinaryTree.build(nums1);
		TreeNode t2 = BinaryTree.build(nums2);
		TreeNode actual = bt.mergeTrees(t1, t2);
		TreeNode expected = new TreeNode(3);
		expected.left = new TreeNode(5);
		expected.right = new TreeNode(7);
		expected.left.left = null;
		expected.left.right = new TreeNode(6);
		if (actual == null)
			fail("Actual is null when at least one Node was expected.");
		testBinaryTree(expected, actual, true);
	}

	@Test
	public void leetCodeTest() {
		int[] nums1 = { 1, 3, 2, 5 };
		Integer[] nums2 = { 2, 1, 3, null, 4, null, 7 };
		TreeNode t1 = BinaryTree.build(nums1);
		TreeNode t2 = BinaryTree.build(nums2);
		TreeNode actual = bt.mergeTrees(t1, t2);
		TreeNode expected = new TreeNode(3);
		expected.left = new TreeNode(4);
		expected.right = new TreeNode(5);
		expected.left.left = new TreeNode(5);
		expected.left.right = new TreeNode(4);
		expected.right.left = null;
		expected.right.right = new TreeNode(7);
		if (actual == null)
			fail("Actual is null when at least one Node was expected.");
		testBinaryTree(expected, actual, true);
	}

	/**
	 * Recursively test if Binary Trees are equal to one another
	 * 
	 * @param eRoot Expected Root or Node
	 * @param aRoot Actual Root or Node
	 * @param flag  If False, Expected and Actual Binary Trees do not match
	 * @return
	 */
	private boolean testBinaryTree(TreeNode eRoot, TreeNode aRoot, boolean flag) {
		if (flag == false)
			return false;
		if (eRoot == null && aRoot == null)
			return true;
		if ((eRoot == null && aRoot != null) || (eRoot != null && aRoot == null))
			return false;
		if (eRoot.val == aRoot.val) {
			testBinaryTree(eRoot.left, aRoot.left, true);
			if (flag == false)
				return false;
			testBinaryTree(eRoot.right, aRoot.right, true);
			if (flag == false)
				return false;
		} else {
			return false;
		}
		return true;

	}

}
