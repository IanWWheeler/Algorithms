package easy;

/*
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseStringRecursive {

	public char[] reverseStr(char[] s) {
		if(s == null) return s;
		return helper(0, s, s.length - 1);
	}

	private char[] helper(int index, char[] s, int revIndex) {
		if(s == null || index >= s.length) {
			return s;
		}
		helper(index + 1, s, revIndex - 1);
		if(s.length / 2 > revIndex) {
			s = swap(index, revIndex, s);
		}
		return s;
	}
	
	private char[] swap(int i, int j, char[] s) {
		char temp = s[j];
		s[j] = s[i];
		s[i] = temp;
		return s;
	}

}