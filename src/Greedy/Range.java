package Greedy;
import java.util.*;
/* 
 Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
 */
public class Range {

	public List<String> summaryRanges(int[] nums) {
	        List<String> res = new ArrayList<>();
	        
	        if (nums == null || nums.length == 0)
	            return res;
	        
	        int start = nums[0];
	        int end = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] == end + 1) {
	                end = nums[i];
	            } 
	            else 
	            {
	                if (start == end) 
	                    res.add(String.valueOf(start));
	                else 
	                    res.add(start + "->" + end);
	                
	                start = nums[i];
	                end = nums[i];
	            }
	        }

	        // Adding the last range
	        if (start == end) {
	            res.add(String.valueOf(start));
	        } else {
	            res.add(start + "->" + end);
	        }

	        return res;          
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
