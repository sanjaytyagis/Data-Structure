package DynamicProgrammingSubSequence;
import java.util.*;

/* Memonisation
   static boolean subsetSumUtil(int ind, int target, int[] arr, int[][] dp) {
   
	        // If the target sum is achieved, return true
	        if (target == 0)
	            return true;

// reach at last index of array and target is still >0 then return false else return true
	        if (ind == 0)
	            return arr[0] == target;

	        // If the result for this subproblem has already been calculated, return it
	        if (dp[ind][target] != -1)
	            return dp[ind][target] == 0 ? false : true;

	        // Try not taking the current element
	        boolean notTaken = subsetSumUtil(ind - 1, target, arr, dp);

	        // Try taking the current element if it doesn't exceed the target
	        boolean taken = false;
	        if (arr[ind] <= target)
	            taken = subsetSumUtil(ind - 1, target - arr[ind], arr, dp);

	       // if both choices are false then return 0 else if any one is true then return true
	        dp[ind][target] = notTaken || taken ? 1 : 0;
	        
	        return notTaken || taken;
	    }
	    
	    int arr[] = {1};
        int k = 2;
        int n = arr.length;
        int dp[][] = new int[n][k + 1];
        
        // Initialize DP table with -1 (unprocessed)
        for (int row[] : dp)
            Arrays.fill(row, -1);

        // Call the recursive helper function
        System.out.println(subsetSumToK(n - 1, k, arr));
 */
public class SubsetSumTarget {

	static boolean subsetSumToK(int n, int k, int[] arr) {
        // Create a boolean DP table with dimensions [n][k+1]
        boolean dp[][] = new boolean[n][k + 1];
        
        // Initialize the first column of the DP table
        for (int i = 0; i < n; i++) 
            dp[i][0] = true;
        
        // Initialize the first row of the DP table
        if (arr[0] <= k) 
            dp[0][arr[0]] = true;
        

        // Fill in the DP table using bottom-up approach
        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= k; target++) {
                // Calculate if the current target can be achieved without taking the current element
                boolean notTaken = dp[ind - 1][target];
                
                // Calculate if the current target can be achieved by taking the current element
                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = dp[ind - 1][target - arr[ind]];
                }
                
                // Store the result in the DP table
                dp[ind][target] = notTaken || taken;
            }
        }
        // The final result is stored in the bottom-right cell of the DP table
        return dp[n - 1][k];
    }
	 
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
        int k = 4;
        int n = arr.length;
        System.out.println( subsetSumToK(n, k, arr));
	}
}
