package easy;

/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Note:
All given inputs are in lowercase letters a-z.*/

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) return "";
		String lcp = strs[0];
		int i = 1;
		for(; i < strs.length && lcp.length() > 0; i++) {
			int len = Math.min(strs[i].length(), lcp.length());
			String temp = strs[i].substring(0, len);
			if(!lcp.equals(temp)) {
				lcp = strs[0].substring(0, lcp.length() - 1);
				i = 0;
			}
		}
		return lcp;	
    }
}
