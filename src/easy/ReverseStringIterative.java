package easy;

/*
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseStringIterative {
	
	public char[] reverseString(char[] s) {
		 if(s == null || s.length == 0) return s;
		 int i = 0;
		 int j = s.length - 1;
		 while(i < j) {
			 char temp = s[j];
			 s[j] = s[i];
			 s[i] = temp;
			 i++; j--;
		 }
		 return s;
	 }

}
