package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a collection of numbers that might contain duplicates, 
return all possible unique permutations.

Example:
Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
*/
public class PermutationsII {
	
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permList = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        permuteHelper(nums, permList, subList, visited);
        
        return permList;     
    }
	
	private void permuteHelper(int[] nums, List<List<Integer>> permList, List<Integer> subList, boolean[] visited) {
		if(subList.size() == nums.length) {
			permList.add(new ArrayList<>(subList));
			return;
		} else {
			for(int i = 0; i < nums.length; i++) {
				if(visited[i] || i > 0 && nums[i] == nums[i-1] && visited[i-1]) continue;
					visited[i] = true;
					subList.add(nums[i]);
					permuteHelper(nums, permList, subList, visited);
					visited[i] = false;
					subList.remove(subList.size() - 1);		
			}
		}
	}
}
