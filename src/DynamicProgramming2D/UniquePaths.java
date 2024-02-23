package DynamicProgramming2D;
import java.util.*;
/*
 There is a robot on an m x n grid. The robot is initially located at the top-left corner 
 (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). 
 The robot can only move either down or right at any point in time.
 */

/*
 // Memonisation
  * 
    static int countWaysUtil(int i, int j, int[][] dp) {
        // If we reach the starting cell (0, 0), there's one way to reach it.
        if (i == 0 && j == 0)
            return 1;
        
        // If we go out of bounds, there's no way to reach the cell.
        if (i < 0 || j < 0)
            return 0;

        // If the value for this cell is already computed, return it.
        if (dp[i][j] != -1)
            return dp[i][j];

        // Calculate the number of ways by moving up and moving left.
        int up = countWaysUtil(i - 1, j, dp);
        int left = countWaysUtil(i, j - 1, dp);

        // Store the result in the DP array and return it.
        return dp[i][j] = up + left;
    }
 */
public class UniquePaths {

	// Tabulation
    static int countWaysUtil(int m, int n, int[][] dp) {
        // Loop through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Calculate the number of ways by moving up (if possible) and left (if possible)
                if (i > 0)
                    up = dp[i - 1][j];
                if (j > 0)
                    left = dp[i][j - 1];

                // Store the total number of ways to reach the current cell in the DP array
                dp[i][j] = up + left;
            }
        }

        // Return the number of ways to reach the bottom-right cell (m-1, n-1)
        return dp[m - 1][n - 1];
    }
    
	public static void main(String[] args) {
		
		 	int m = 3;
	        int n = 2;

	        int dp[][] = new int[m][n];
	        
	        // Initialize the DP array with -1 to indicate uncomputed values
	        for (int[] row : dp)
	            Arrays.fill(row, -1);

	        // Start the recursive calculation from the bottom-right cell (m-1, n-1)
	        System.out.println(countWaysUtil(m, n, dp));
	}
}
