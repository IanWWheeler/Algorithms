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
			Assert.assertThat(expectedList.get(i), IsEqual.equalTo((actualList.get(i))));
		}
	}

}