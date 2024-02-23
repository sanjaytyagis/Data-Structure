package DynamicProgramming2D;

import java.util.Arrays;

public class NinjaTrainingTabulation {

	// Function to find the maximum points for ninja training
    static int ninjaTraining(int n, int[][] points) {
        // Initialize a 2D array 'dp' to store the maximum points
        int[][] dp = new int[n][4];
        
        // Initialize the first day's maximum points based on the available choices
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2])); 

        // Iterate through each day and each activity
        
        for (int day = 1; day < n; day++) {
        	
            for (int last = 0; last < 4; last++) {
            	// Initialize the maximum points for the current day and last activity
            	
                dp[day][last] = 0; 
                
                // Consider each possible task for the current day
                for (int task = 0; task <= 2; task++) {
                	
                    if (task != last) { 
 // Calculate the points for the current activity and add it to the maximum points from the previous day
                        
                    	int activity = points[day][task] + dp[day - 1][task];
                        // Update the maximum points for the current day and last activity
                        dp[day][last] = Math.max(dp[day][last], activity);
                    }
                }
            }
        }

        // Return the maximum points achievable after all days (last activity is 3)
        return dp[n - 1][3];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {	
							{2, 1, 3},
							{3, 4, 6},
							{10, 1, 6},
							{8, 3, 7}
    		 			 };
		
		int n = points.length; // Get the number of days
		System.out.println(ninjaTraining(n, points));
	}

}
