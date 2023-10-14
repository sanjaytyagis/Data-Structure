package ArraysEasy;
import java.util.*;

/*
 while(j<n) {
            sum+=nums[j];
            
            if(j-i+1<k) {
              j++;
            } 
            else if(j-i+1==k){
                max=Math.max(max,sum);
                sum=sum-nums[i];
                j++;    
                i++;
            }
        }
 */
public class SlidingWindowMaximumSumSubarray {


	public static int findMaxSumSubArray(int k, int[] arr) {
		// K is a window size
		// window size (j-i+1)
		
	    int maxSum = 0, windowSum = 0;
	    int windowStart = 0;

	    for (int windowEnd=0; windowEnd < arr.length; windowEnd++) {
	    	
	      windowSum += arr[windowEnd];
	      
	      if(windowEnd >= k-1) {
	        maxSum = Math.max(maxSum, windowSum);
	        windowSum -= arr[windowStart];
	        windowStart++;
	      }
	    }
	    return maxSum;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
