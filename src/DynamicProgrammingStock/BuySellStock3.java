package DynamicProgrammingStock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Only Two transactions are allowed = Buy+sell,
//means we pass transactions in function would only decrease if buy and sell both are done
public class BuySellStock3 {

	static int getAns(int[] Arr, int n, int ind, int buy, int trasaction, int[][][] dp) {
        // Base case: If we have processed all stocks or have no capital left, return 0 profit
        if (ind == n || trasaction == 0)
            return 0;

        // If the result for this state is already calculated, return it
        if (dp[ind][buy][trasaction] != -1)
            return dp[ind][buy][trasaction];

        int profit=0;

        if (buy == 0) { // We can buy the stock
            profit = Math.max(0 + getAns(Arr, n, ind + 1, 0, trasaction, dp),
                    -Arr[ind] + getAns(Arr, n, ind + 1, 1, trasaction, dp));
        }

        if (buy == 1) { // We can sell the stock
            profit = Math.max(0 + getAns(Arr, n, ind + 1, 1, trasaction, dp),
                    Arr[ind] + getAns(Arr, n, ind + 1, 0, trasaction - 1, dp));
        }

        // Store the calculated profit in the dp array and return it
        return dp[ind][buy][trasaction] = profit;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int n = prices.length;
        int trasaction = 2;
        // Creating a 3D dp array of size [n][2][3]
        int[][][] dp = new int[n][2][3];

        // Initialize the dp array with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        	System.out.println(getAns(prices, n, 0, 0, trasaction, dp));
       
	}

}
