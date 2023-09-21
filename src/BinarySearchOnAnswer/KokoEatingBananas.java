package BinarySearchOnAnswer;
/*
 Example 1:
Input Format: N = 4, a[] = {7, 15, 6, 3}, h = 8
Result: 5
Explanation: If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly. So, he will take 8 hours to complete all the piles.  

Approach1 :- Brute force run 1st loop till max element and 2nd loop each element divide by 1st loop element one by one
Approach 2 Optima:- on max element for loop apply binary serach
 */
public class KokoEatingBananas {

	//Find Max Element in the array
        public static int findMax(int[] v) {
            int maxi = Integer.MIN_VALUE;;
            int n = v.length;
            //find the maximum:
            for (int i = 0; i < n; i++) {
                maxi = Math.max(maxi, v[i]);
            }
            return maxi;
        }
        
        // calculating total no of hours by dividing each element one by one
        
        public static int calculateTotalHours(int[] v, int hourly) {
            int totalH = 0;
            int n = v.length;
            //find total hours:
            for (int i = 0; i < n; i++) {
                totalH += Math.ceil((double)(v[i]) / (double)(hourly));
            }
            return totalH;
        }
        
        public static int minimumRateToEatBananas(int[] v, int h) {
            int low = 1, high = findMax(v);

            //apply binary search:
            while (low <= high) {
                int mid = (low + high) / 2;
                int totalH = calculateTotalHours(v, mid);
                if (totalH <= h) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
	}

}
