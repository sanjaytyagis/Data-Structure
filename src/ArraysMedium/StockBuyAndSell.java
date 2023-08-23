package ArraysMedium;

// Approach1 two for loop and find max 

/* Approach 2 Optimal
 
Create a variable maxPro and store 0 initially.
Create a variable minPrice and store some larger value(ex: MAX_VALUE) value initially.
Run a for loop from 0 to n.
Update the minPrice if it is greater than the current element of the array
Take the difference of the minPrice with the current element of the array and compare and maintain it in maxPro.
Return the maxPro.
*/

public class StockBuyAndSell {

	static int maxProfit(int[] arr) {
	    int maxPro = 0;
	    int minPrice = Integer.MAX_VALUE;
	    
	    for (int i = 0; i < arr.length; i++) {
	        minPrice = Math.min(minPrice, arr[i]);
	        maxPro = Math.max(maxPro, arr[i] - minPrice);
	    }
	    return maxPro;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,5,3,6,4};

	    int maxPro = maxProfit(arr);
	    System.out.println("Max profit is: " + maxPro);
	}

}
