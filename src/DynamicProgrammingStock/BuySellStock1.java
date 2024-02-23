package DynamicProgrammingStock;

public class BuySellStock1 {

	public static int maxProfit(int[] prices) {
		
        // selling and buy on same day due to which profit considered 0
        int min = prices[0], profit = 0;
        
//i==1 because doing opposite sell on iTh day and buying on i-1 day so that we can track min value for buy
    	
        for(int i = 1; i< prices.length; i++){ 
            int amount = prices[i] - min;
            
            profit = Math.max(profit,amount); // if amt big then update profit
            
            // before incrementing i updating min value
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
	
	public static void main(String[] args) {
		int[] arr  ={7,1,5,3,6,4};

		System.out.println(maxProfit(arr));

	}
}
