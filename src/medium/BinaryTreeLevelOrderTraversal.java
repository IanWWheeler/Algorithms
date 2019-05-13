package medium;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

/*
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * 
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
*/

public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		levelOrderHelper(root, 0, list);
		return list;
        
    }
	
	private void levelOrderHelper(TreeNode root, int level, List<List<Integer>> list) {
		if(root != null) {
			if(level == list.size()) {
				list.add(new ArrayList<Integer>());
			}
			list.get(level).add(root.val);		
			levelOrderHelper(root.left, level+1, list);
			levelOrderHelper(root.right, level+1, list);
		}
	}
}
