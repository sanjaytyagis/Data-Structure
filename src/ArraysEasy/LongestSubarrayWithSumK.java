package ArraysEasy;

// Approach 1 :- complexity will be 2*N because inner loop can ran maximum till n length only
// Approach 2 :- HashMap with (sum-k) if sum-k is available in hashMap it means that k sum is avaiable.

public class LongestSubarrayWithSumK {

	public static int longestSubarrayWithSumK(int []a, long k) {
        int j=-1,max=0;
        long sum=0;

        for(int i=0; i<a.length; i++){
            sum = sum+a[i];

            // reduce the sum behind i th index until sum is greater than K
            while(sum>k && j<a.length){
                j++;
                sum = sum - a[j];
            }

            if(sum==k){
            	// to store the count of elements equal to sum like three elements sum is equal to k, so the count is 3
                int temp = ((i-j));
                max = Math.max(max,temp);
            }
        }
        return max; 
    }
	
	public static void main(String[] args) {
		int input[] = {1,2,3,1,1,1,1};
		int result = LongestSubarrayWithSumK.longestSubarrayWithSumK(input,2);
		System.out.println(result);
	}
}

/* HashMap 

public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length; // size of the array.            

        Map<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;                                      
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            
            //put the sum in Map if sum isn't exist in map
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
}
*/