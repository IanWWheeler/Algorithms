package common;

/**
 * Class uses static methods to create Binary Trees off of integer arrays
 * 
 * @author ianww
 *
 */
public class BinaryTree {
	
	/**
	 * Build binary trees using primitive int
	 * @param nums
	 * @return
	 */
	public static TreeNode build(int[] nums) {
		if(nums == null || nums.length == 0) return null; 
		return buildHelper(new TreeNode(0), nums, 0);
	}
	
	/**
	 * Build binary trees using Object Integer
	 * @param nums
	 * @return
	 */
	public static TreeNode build(Integer[] nums) {
		if(nums == null || nums.length == 0) return null; 
		return buildHelper(new TreeNode(0), nums, 0);
	}
	
	private static TreeNode buildHelper(TreeNode root, int[] nums, int i) {
		if(i < nums.length) {
			root = new TreeNode(nums[i]);
			int l = (i * 2) + 1;
			root.left = buildHelper(root.left, nums, l);
			int r = (i * 2) + 2;
			root.right = buildHelper(root.right, nums, r);
		}
		
		return root;
	}
	
	private static TreeNode buildHelper(TreeNode root, Integer[] nums, int i) {
		if(i < nums.length) {
			if(nums[i] == null) return null;
			root = new TreeNode(nums[i]);
			int l = (i * 2) + 1;
			root.left = buildHelper(root.left, nums, l);
			int r = (i * 2) + 2;
			root.right = buildHelper(root.right, nums, r);
		}
		
		return root;
	}
}
