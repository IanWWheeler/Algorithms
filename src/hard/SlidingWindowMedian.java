package hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
Median is the middle value in an ordered integer list. If the size of the list is even, 
there is no middle value. So the median is the mean of the two middle value.

Examples: 
[2,3,4] , the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Given an array nums, there is a sliding window of size k which is moving from the very 
left of the array to the very right. You can only see the k numbers in the window. 
Each time the sliding window moves right by one position. Your job is to output the 
median array for each window in the original array.

For example,
Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.

Window position                Median
---------------               -----
[1  3  -1] -3  5  3  6  7       1
 1 [3  -1  -3] 5  3  6  7       -1
 1  3 [-1  -3  5] 3  6  7       -1
 1  3  -1 [-3  5  3] 6  7       3
 1  3  -1  -3 [5  3  6] 7       5
 1  3  -1  -3  5 [3  6  7]      6
Therefore, return the median sliding window as [1,-1,-1,3,5,6].

Note: 
You may assume k is always valid, ie: k is always smaller than input array's size for 
non-empty array.
*/
public class SlidingWindowMedian {
	
	/*
	 * Taken from LeetCode forums
	 * The Priority Queues are used to keep track of the two "sides" of the slide window
	 * Whatever is closest to zero (0), is considered the first element of the queue
	 * So minH would have [-1, -3] and maxH would have [1, 3]
	 * 
	 * getMedian normalizes the value by multiplying each by 0.5 and then adding the two together
	 */
	private PriorityQueue<Integer> minH = new PriorityQueue<Integer>();
    private PriorityQueue<Integer> maxH = new PriorityQueue<Integer>(1,Collections.reverseOrder());
    
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length-k+1];
        for (int i = 0;i<=nums.length;i++){

            if(i>=k){
                result[i-k] = getMedian();
                removeNum(nums[i-k]);
            }
            if(i<nums.length){
                addNum(nums[i]);
            }
        }
        return result;
    }
    
    public void addNum(int num){
        minH.add(num);
        maxH.add(minH.remove());
        if(minH.size()<maxH.size()){
            minH.add(maxH.remove());
        }
    }
    
    public void removeNum(int num){
        if(minH.contains(num)){
             minH.remove(num);
        }
        else{
            maxH.add(minH.poll());
            maxH.remove(num);
        } 
    }
    
    public double getMedian(){
         return minH.size()>maxH.size()? (double) minH.peek():(minH.peek()*0.5+maxH.peek()*0.5);
    }
    

	/*
	 * Naive solution - Gets the job done, but not efficiently.
	 */
	public double[] medianSlidingWindowNaive(int[] nums, int k) {
		if(nums == null) return null;
		int len = nums.length - k + 1;
		int j = k - 1; // index to use in relation to K
        double[] medians = new double[len]; // medians to return
        double[] medianArray; // medianArray to use and clear each time (will use for Sort)
        
        
        for(int i = 0; i < nums.length - j; i++) {
        	medianArray = new double[k];
        	int idx = 0;
        	int p = i;
        	while(p < i + k) {
        		medianArray[idx++] = nums[p++];
        	}
        	Arrays.sort(medianArray);
        	if(k % 2 == 0) {
        		medians[i] = (double)(medianArray[k/2 - 1] + medianArray[k/2]) / 2;
        	} else {
        		medians[i] = medianArray[k/2];
        	}
        	
        }
           
        return medians;
    }
}
