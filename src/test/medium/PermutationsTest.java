package test.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import medium.Permutations;

public class PermutationsTest {
	
	Permutations perms;

	@Test
	public void testOne() {
		perms = new Permutations();
		int[] nums = {1, 2, 3};
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		expectedList.add(Arrays.asList(1,2,3));
		expectedList.add(Arrays.asList(1,3,2));
		expectedList.add(Arrays.asList(2,1,3));
		expectedList.add(Arrays.asList(2,3,1));
		expectedList.add(Arrays.asList(3,1,2));
		expectedList.add(Arrays.asList(3,2,1));
		List<List<Integer>> actualList = perms.permute(nums);
		
		for(int i = 0; i < actualList.size(); i++) {	
			Assert.assertThat(expectedList.get(i), IsEqual.equalTo((actualList.get(i))));
		}
	}
	
}

/*
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]
 */