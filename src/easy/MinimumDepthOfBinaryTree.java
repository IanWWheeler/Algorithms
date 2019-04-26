package easy;

import common.TreeNode;

/*Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.*/

public class MinimumDepthOfBinaryTree {
	
	public int minDepth(TreeNode root) {
		if(root == null) return 0;
		int l = minDepth(root.left);
		int r = minDepth(root.right);
		// when root has only one child - we're looking for leafs
		if(l == 0 && r > 0) return (1 + r);
		if(r == 0 && l > 0) return (1 + l);
		return (1 + Math.min(l, r));	
    }

}
