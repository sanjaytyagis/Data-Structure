package DynamicProgrammingSubSequence;
import java.util.*;

/* Memonisation
   static int knapsackUtil(int[] wt, int[] val, int ind, int W, int[][] dp) {
        // Base case: If there are no items or the knapsack capacity is zero
        if (ind == 0 && wt[0] <= W) 
                return val[0];
        
        if (ind == 0 && wt[0] >= W) 
            return 0;
        

        // If the result for this subproblem is already calculated, return it
        if (dp[ind][W] != -1) {
            return dp[ind][W];
        }

        // Calculate the maximum value when the current item is not taken
        int notTaken = knapsackUtil(wt, val, ind - 1, W, dp);

        // Calculate the maximum value when the current item is taken
        int taken = Integer.MIN_VALUE;
        if (wt[ind] <= W) {
            taken = val[ind] + knapsackUtil(wt, val, ind - 1, W - wt[ind], dp);
        }

        // Store and return the result for the current state
        dp[ind][W] = Math.max(notTaken, taken);
        return dp[ind][W];
    }
 */
public class KnapSack01 {

	static int knapsack(int[] wt, int[] val, int n, int W) {
        
        int dp[][] = new int[n][W + 1];
        
        // Base Condition
        for (int i = wt[0]; i <= W; i++) {
            dp[0][i] = val[0];
        }
        
        for (int ind = 1; ind < n; ind++) {
            for (int cap = 0; cap <= W; cap++) {
                // Calculate the maximum value when the current item is not taken
                int notTaken = dp[ind - 1][cap];
                
                // Calculate the maximum value when the current item is taken
                int taken = Integer.MIN_VALUE;
                if (wt[ind] <= cap) {
                    taken = val[ind] + dp[ind - 1][cap - wt[ind]];
                }
                
                // Store the maximum value for the current state
                dp[ind][cap] = Math.max(notTaken, taken);
            }
        }
        
        // The result is stored in the last row and last column of the DP array
        return dp[n - 1][W];
    }
	
	public static void main(String[] args) {
		
		 int wt[] = {1, 2, 4, 5};
	        int val[] = {5, 4, 8, 6};
	        int W = 5;
	        int n = wt.length;
	        int dp[][] = new int[n][W + 1];

	        // Initialize the DP array with -1 to indicate that subproblems are not solved
	        for (int row[] : dp) {
	            Arrays.fill(row, -1);
	        }
	        	//System.out.println(knapsackUtil(wt, val, n - 1, W, dp));
	        
	}

}
