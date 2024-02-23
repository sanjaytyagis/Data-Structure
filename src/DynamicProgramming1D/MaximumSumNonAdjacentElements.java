package DynamicProgramming1D;
import java.util.*;
/*
    Input: nums = [2,7,9,3,1]
	Output: 12
	Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
	Total amount you can rob = 2 + 9 + 1 = 12.
	
	// This function recursively calculates the maximum possible sum
    // by considering or not considering the current element.
    static int solveUtil(int ind, int[] arr, int[] dp) {
        // If the index is negative, there are no elements left to consider.
        if (ind < 0) 
        	return 0;
        
        // If the index is 0, there is only one element to consider, so return its value.
        if (ind == 0)
        	return arr[ind];
        
        if (dp[ind] != -1)
        	return dp[ind];
        
        // Calculate the maximum sum by either picking the current element or not picking it.
        int pick = solveUtil(ind - 2, arr, dp) + arr[ind]; // either we can pick first index element
        
        int nonPick = solveUtil(ind - 1, arr, dp); // either we can pick 2nd index element
        
        // Store the maximum of the two options in the dp array for future reference.
        return dp[ind] = Math.max(pick, nonPick);
    }
 */

// House Robber Problem
public class MaximumSumNonAdjacentElements {

	static int solveUtil(int n, int[] arr, int[] dp) {
        // Initialize the dp array with the first element of the input array.
        dp[0] = arr[0];

        
        for (int i = 1; i < n; i++) {
            // Calculate the maximum sum by either picking the current element or not picking it.
            int pick = arr[i];
            
            // If there are at least two elements before the current element, add the value from dp[i-2].
            if (i > 1)
                pick += dp[i - 2];
            
            // The non-pick option is to use the maximum sum from the previous element.
            int nonPick = dp[i - 1];

            // Store the maximum of the two options in the dp array for the current index.
            dp[i] = Math.max(pick, nonPick);
        }

        // The final element of the dp array contains the maximum possible sum.
        return dp[n - 1];
    }
    
	public static void main(String[] args) {
		
        int arr[] = {2};
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(solveUtil(n, arr, dp));
	}

}
