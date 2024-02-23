package DynamicProgrammingStock;
import java.util.*;

// one trasaction = Buy+sell
// for infinite transaction like but and sell, but you can't sell before buy
public class BuySellStock2 {

	// Tabulation
	static long getMaximumProfit(long[] Arr, int n) {
        // Create a 2D array for dynamic programming with dimensions [n+1][2]
        long[][] dp = new long[n + 1][2];

        // Initialize the entire dp table with -1
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Base condition: If we have no stocks to buy or sell, profit is 0
        dp[n][0] = dp[n][1] = 0;

        long profit = 0;

        // Iterate through the array in reverse to calculate the maximum profit
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                if (buy == 0) { // We can buy the stock
                    profit = Math.max(0 + dp[ind + 1][0], -Arr[ind] + dp[ind + 1][1]);
                }

                if (buy == 1) { // We can sell the stock
                    profit = Math.max(0 + dp[ind + 1][1], Arr[ind] + dp[ind + 1][0]);
                }

                dp[ind][buy] = profit;
            }
        }
        return dp[0][0]; // The maximum profit is stored at dp[0][0]
    }
	
	//Memonisation
	static long getMaximumProfitUtil(long[] Arr, int ind, int buy, int n, List<List<Long>> dp) {
        // Base case
        if (ind == n)
            return 0;

        // If the result is already computed, return it
        if (dp.get(ind).get(buy) != -1)
            return dp.get(ind).get(buy);

        long profit =0;

        if (buy == 0) { // We can buy the stock
        	
        	long willtobuy = -Arr[ind] + getMaximumProfitUtil(Arr, ind + 1, 1, n, dp);
        	long donotbuy = 0 + getMaximumProfitUtil(Arr, ind + 1, 0, n, dp);
        	
            profit = Math.max(willtobuy,donotbuy);
        }

        if (buy == 1) { // We can sell the stock
        	
        	long willtosell = Arr[ind] + getMaximumProfitUtil(Arr, ind + 1, 0, n, dp);
        	long donotsell = 0 + getMaximumProfitUtil(Arr, ind + 1, 1, n, dp);
        	
            profit = Math.max(willtosell,donotsell);
        }

        // Store the result in the dp table and return it
        dp.get(ind).set(buy, profit);
        return profit;
    }
	
	public static void main(String[] args) {
		
	     long[] Arr = {1,2};
	     int n = Arr.length;
	     List<List<Long>> dp = new ArrayList<>(n);
	        for (int i = 0; i < n; i++) {
	            List<Long> row = new ArrayList<>(2);
	            row.addAll(Arrays.asList(-1L, -1L));
	            dp.add(row);
	        }

	        // Calculate the maximum profit using the recursive function
	        long ans = getMaximumProfitUtil(Arr, 0, 0, n, dp);
	        System.out.println(ans);
	        
	        for(List<Long> j : dp)
	        System.out.println(j.toString());
	}
}
