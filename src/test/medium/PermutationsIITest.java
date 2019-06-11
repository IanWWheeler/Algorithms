package test.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import medium.PermutationsII;

public class PermutationsIITest {
	
	PermutationsII perms;

	@Test
	public void testOne() {
		perms = new PermutationsII();
		int[] nums = {1, 1, 2};
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		expectedList.add(Arrays.asList(1,1,2));
		expectedList.add(Arrays.asList(1,2,1));	
		expectedList.add(Arrays.asList(2,1,1));	
		List<List<Integer>> actualList = perms.permuteUnique(nums);
		
		for(int i = 0; i < actualList.size(); i++) {	
			Assert.assertThat(actualList.get(i), IsEqual.equalTo((expectedList.get(i))));
		}
	}
	
	@Test
	public void testTwo() {
		perms = new PermutationsII();
		int[] nums = {3, 3, 0, 3};
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		expectedList.add(Arrays.asList(0,3,3,3));
		expectedList.add(Arrays.asList(3,0,3,3));	
		expectedList.add(Arrays.asList(3,3,0,3));
		expectedList.add(Arrays.asList(3,3,3,0));
		List<List<Integer>> actualList = perms.permuteUnique(nums);
		
		for(int i = 0; i < actualList.size(); i++) {	
			Assert.assertThat(actualList.get(i), IsEqual.equalTo((expectedList.get(i))));
		}
	}
	
	@Test
	public void testThree() {
		perms = new PermutationsII();
		int[] nums = {4, 4, 4};
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		expectedList.add(Arrays.asList(4,4,4));
		List<List<Integer>> actualList = perms.permuteUnique(nums);
		
		for(int i = 0; i < actualList.size(); i++) {	
			Assert.assertThat(actualList.get(i), IsEqual.equalTo((expectedList.get(i))));
		}
	}

}