package medium;

import java.util.ArrayList;
import java.util.List;
/*
Given a collection of distinct integers, return all possible permutations.

Example:
Input: [1,2,3]
Output:
[
[1,2,3],
[1,3,2],
[2,1,3],
[2,3,1],
[3,1,2],
[3,2,1]
]
*/		
public class Permutations {
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> permlist = new ArrayList<List<Integer>>();
		ArrayList<Integer> sublist = new ArrayList<Integer>();
		permuteHelper(nums, permlist, sublist);
		return permlist;
	}

	private void permuteHelper(int[] nums, List<List<Integer>> permlist, ArrayList<Integer> sublist) {
		if(sublist.size() == nums.length) {
			permlist.add(new ArrayList<Integer>(sublist));
		} else {
			for(int i = 0; i < nums.length; i++) {
				if(sublist.contains(nums[i])) continue;
				sublist.add(nums[i]);
				permuteHelper(nums, permlist, sublist);
				sublist.remove(sublist.size() - 1);
			}
		}
		
	}
}
