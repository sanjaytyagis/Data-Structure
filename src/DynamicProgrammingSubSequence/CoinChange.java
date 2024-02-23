package DynamicProgrammingSubSequence;
import java.util.*;
/*
 Return the fewest number of coins that you need to make up that amount. 
 If that amount of money cannot be made up by any combination of the coins, return -1.
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
 */
public class CoinChange {

	static int minimumElementsUtil(int[] arr, int ind, int T, int[][] dp) {
        
	       if(ind ==0 && T % arr[0] ==0)
	       return T / arr[0];

	       if(ind ==0 && T % arr[0] !=0)
	       return Integer.MAX_VALUE;

	        if (dp[ind][T] != -1)
	            return dp[ind][T];

	        int notTaken =  minimumElementsUtil(arr, ind - 1, T, dp);

	        int taken = Integer.MAX_VALUE;

	        if (arr[ind] <= T)
	            taken = 1 + minimumElementsUtil(arr, ind, T - arr[ind], dp);

	        return dp[ind][T] = Math.min(notTaken, taken);
	    }
	
public static void main(String[] args) {
	
		int coins[] = { 1, 2, 3 };
	    int amount = 7;
		int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int row[] : dp)
            Arrays.fill(row, -1);

        int ans = minimumElementsUtil(coins, n - 1, amount, dp);

        if (ans == Integer.MAX_VALUE)
           System.out.println(-1);
        
        System.out.println(ans);	
	}
}
