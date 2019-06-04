package hard;

import java.util.HashMap;
import java.util.Random;

/*
Given a blacklist B containing unique integers from [0, N), write a function \
to return a uniform random integer from [0, N) which is NOT in B.

Optimize it such that it minimizes the call to system’s Math.random().

Note:

1 <= N <= 1000000000
0 <= B.length < min(100000, N)
[0, N) does NOT include N. See interval notation.
*/

//Solution was taken from LeetCode post. 
//It's a clever way to solve the problem while minimizing the calls to Random();
public class RandomPickWithBlacklist {

	HashMap<Integer, Integer> map;
	int M;
	Random rand;

	public void Solution(int N, int[] blacklist) {
		M = N - blacklist.length;
		map = new HashMap<>();

		// preload map with blacklisted numbers
		for (int num : blacklist)
			map.put(num, -1);

		// load valid values that will replace blacklisted keys
		N--;
		for (int num : blacklist) {
			if (num < M) {
				while (map.containsKey(N)) N--;
				map.put(num, N--);
			}
		}
		
		rand = new Random();
	}

	public int pick() {
		int num = rand.nextInt(M);
		return map.containsKey(num) ? map.get(num) : num;
	}
}

/**
 * Your Solution object will be instantiated and called as such: Solution obj =
 * new Solution(N, blacklist); int param_1 = obj.pick();
 */
