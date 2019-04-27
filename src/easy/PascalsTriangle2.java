package easy;

import java.util.ArrayList;
import java.util.List;

/*Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
Note that the row index starts from 0.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:
Input: 3
Output: [1,3,3,1]

Follow up:
Could you optimize your algorithm to use only O(k) extra space?*/

public class PascalsTriangle2 {
	public List<Integer> getRow(int rowIndex) {
		if(rowIndex < 0) return new ArrayList<Integer>();
		ArrayList<List<Integer>> pt = new ArrayList<List<Integer>>();

        for(int i = 1; i - 1 <= rowIndex; i++) {
        	ArrayList<Integer> row = new ArrayList<Integer>();
        	if(i == 1) {
        		row.add(1);
        	} else {
        		row.add(1);
        		for(int j = 1; j < i - 1; j++) {
        			row.add(pt.get(i-2).get(j-1) + pt.get(i-2).get(j));
        		}
        		row.add(1);
        	}
        	pt.add(row);
        }
        return pt.get(rowIndex);
    }

}
