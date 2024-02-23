package DynamicProgramming2D;
import java.util.*;
public class NinjaTrainingMempnization {

	// Recursive function to calculate the maximum points for the ninja training
	
    static int f(int day, int lastTaskPicked, int[][] points, int[][] dp) {
    	
        if (dp[day][lastTaskPicked] != -1)
        	return dp[day][lastTaskPicked];

        // Base case: When it's the first day (day == 0)
        
        if (day == 0) {
        	
            int maxi = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != lastTaskPicked)
                    maxi = Math.max(maxi, points[day][i]);
            }
             dp[day][lastTaskPicked] = maxi; 
            return dp[day][lastTaskPicked];
        }

        int maxi = 0;
        // Loop through the three activities on the current day
        
        for (int i = 0; i <= 2; i++) {
        	
            if (i != lastTaskPicked) {
                // Calculate the points for the current activity and recursively
                // calculate the maximum points for the previous day
                int activity = points[day][i] + f(day - 1, i, points, dp);
                maxi = Math.max(maxi, activity); // Update the maximum points
            }
        }

         dp[day][lastTaskPicked] = maxi; // Store and return the result
         
         return dp[day][lastTaskPicked];
    }
    
	public static void main(String[] args) {
		
		int[][] points = {	{2, 1, 3},
                		 	{3, 4, 6},
                		 	{10, 1, 6},
                		 	{8, 3, 7}
                		 };
		int n = points.length; // Get the number of days
		int dp[][] = new int[n][4];
		
        for (int[] row : dp)
            Arrays.fill(row, -1);

        // Start the recursive calculation from the lastTaskPicked day (n - 1) with the lastTaskPicked activity (3)
		System.out.println(f(n - 1, 3, points, dp));
		
		// print DP Array
		for (int[] row : dp)
            System.out.println(Arrays.toString(row));
	}
}
