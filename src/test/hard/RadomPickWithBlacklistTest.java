package test.hard;

import java.util.ArrayList;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Test;

import hard.RandomPickWithBlacklist;

public class RadomPickWithBlacklistTest {
	RandomPickWithBlacklist rpbl;
	int[] blacklist;
	int N;
	
	/*
	 * Input: 
	 * ["Solution","pick","pick","pick"] 
	 * [[1,[]],[],[],[]] 
	 * Output:
	 * [null,0,0,0]
	 */
	@Test
	public void blacklistTestOne() {
		rpbl = new RandomPickWithBlacklist();
		blacklist = new int[]{};
		N = 1;
		rpbl.Solution(N, blacklist);
		ArrayList<Integer> picks = new ArrayList<Integer>();
		picks.add(rpbl.pick());
		picks.add(rpbl.pick());
		picks.add(rpbl.pick());
		Assert.assertThat(picks, IsNot.not(IsEqual.equalTo(blacklist)));
	}
	
	/*
	 * Input: 
	 * ["Solution","pick","pick","pick"] 
	 * [[2,[]],[],[],[]] 
	 * Output:
	 * [null,1,1,1]
	 */
	@Test
	public void blacklistTestTwo() {
		rpbl = new RandomPickWithBlacklist();
		blacklist = new int[] {};
		N = 2;
		rpbl.Solution(N, blacklist);
		ArrayList<Integer> picks = new ArrayList<Integer>();
		picks.add(rpbl.pick());
		picks.add(rpbl.pick());
		picks.add(rpbl.pick());
		Assert.assertThat(picks, IsNot.not(IsEqual.equalTo(blacklist)));
	}
	
	/*
	 * Input: 
	 * ["Solution","pick","pick","pick"] 
	 * [[3,[1]],[],[],[]] 
	 * Output:
	 * [null,0,0,2]
	 */				
	@Test
	public void blacklistTestThree() {
		rpbl = new RandomPickWithBlacklist();
		blacklist = new int[] {1};
		N = 3;
		rpbl.Solution(N, blacklist);
		ArrayList<Integer> picks = new ArrayList<Integer>();
		picks.add(rpbl.pick());
		picks.add(rpbl.pick());
		picks.add(rpbl.pick());
		Assert.assertThat(picks, IsNot.not(IsEqual.equalTo(blacklist)));
	}
	
	/*
	 * Input: 
	 * ["Solution","pick","pick","pick"] 
	 * [[4,[2]],[],[],[]] 
	 * Output:
	 * [null,1,3,1]
	 */
	@Test
	public void blacklistTestFour() {
		rpbl = new RandomPickWithBlacklist();
		blacklist = new int[] {2};
		N = 4;
		rpbl.Solution(N, blacklist);
		ArrayList<Integer> picks = new ArrayList<Integer>();
		picks.add(rpbl.pick());
		picks.add(rpbl.pick());
		picks.add(rpbl.pick());
		Assert.assertThat(picks, IsNot.not(IsEqual.equalTo(blacklist)));
	}
}
