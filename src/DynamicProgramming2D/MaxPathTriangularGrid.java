package DynamicProgramming2D;
import java.util.*;
/*
    static int minimumPathSumUtil(int i, int j, int[][] triangle, int n, int[][] dp) 
    {
        
		int min = Integer.MAX_VALUE;
		
        if (dp[i][j] != -1)
            return dp[i][j];

        // If we are at the bottom row, return the value in the triangle
        if (i == n - 1)
            return triangle[i][j];

        // Calculate the number of ways by moving up and moving left.
        int down = minimumPathSumUtil(i + 1, j, triangle, n, dp);
        int diagonal = minimumPathSumUtil(i + 1, j + 1, triangle, n, dp);

        int sum = triangle[i][j] + Math.min(down,diagonal);
        
        // Store the result in the dp array and return the minimum of the two paths
        return dp[i][j] = Math.min(min, sum);
    }
 */

// Tabulation
public class MaxPathTriangularGrid {
	
	static int minimumPathSum(int[][] triangle, int n) {
        // Create a 2D array to store intermediate results
        int dp[][] = new int[n][n];

        // Initialize the bottom row of dp with the values from the bottom row of the triangle
        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = triangle[n - 1][j];
        }

        // Starting from the second to last row, calculate the minimum path sum for each element
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                // Calculate the two possible paths: moving down or moving diagonally
                int down = triangle[i][j] + dp[i + 1][j];
                int diagonal = triangle[i][j] + dp[i + 1][j + 1];

                // Store the minimum of the two paths in dp
                dp[i][j] = Math.min(down, diagonal);
            }
        }

        // The result is stored at the top of dp array
        return dp[0][0];
    }
	
	
	public static void main(String[] args) {
		
		int triangle[][] = {	{1},
                				{2, 3},
                				{3, 6, 7},
                				{8, 9, 6, 10}
                		   };

		int n = triangle.length;

		// Call the minimumPathSum function and print the result
		System.out.println(minimumPathSum(triangle, n));
	}
}
