package ArraysMedium;

// If array is +ve numbers then product of all numbers will be max
// If even negative numbers then multiply all numbers
// If array is -ve and +ve then -ve are odd then eleimnate one -ve and use prefic and suffix from the place of that -ve numbers
public class MaxProductSubArray {

	public static int maxProductSubArray(int[] arr) {
        int n = arr.length; //size of array.

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) 
            	pre = 1;
            if (suff == 0) 
            	suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
	}

}
