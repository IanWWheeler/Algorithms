package easy;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

public class PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {
		if(numRows == 0) return new ArrayList<List<Integer>>();
        List<List<Integer>> pt = new ArrayList<List<Integer>>(); 

        for(int i = 1;  i <= numRows; i++) {
        	 List<Integer> currRow = new ArrayList<Integer>();
        	if(i == 1) {
        		currRow.add(1);
        	} else {
        		currRow.add(1);
	        	for(int j = 1; j < i - 1; j++) {
	        			currRow.add(pt.get(i - 2).get(j - 1) + pt.get(i - 2).get(j));
	        		}
	        	currRow.add(1);
	        	}
	        	pt.add(currRow);
        	}
		return pt;
    }
}
