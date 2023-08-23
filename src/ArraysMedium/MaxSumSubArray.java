package ArraysMedium;
// array is mixed of positive and negative element
public class MaxSumSubArray {

	public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];
            
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
            
            if (sum > maxi) {
                maxi = sum;
            }

        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int n = input.length;
		//int result = Sort012.sortArray(input,n);
		//System.out.println(result);
		
	}

}

/* Kadens Alsgo If max sum is more than 1 then print the array element

long maxi = Long.MIN_VALUE; // maximum sum
long sum = 0;

int start = 0;

int ansStart = -1, ansEnd = -1;

for (int i = 0; i < n; i++) {

    if (sum == 0) start = i; // starting index

    sum += arr[i];
    
     // If sum < 0: discard the sum calculated
    if (sum < 0) {
        sum = 0;
    }

    if (sum > maxi) {
        maxi = sum;

        ansStart = start;
        ansEnd = i;
    }

}

//printing the subarray:
System.out.print("The subarray is: [");
for (int i = ansStart; i <= ansEnd; i++) {
    System.out.print(arr[i] + " ");
}
System.out.print("]n");

// To consider the sum of the empty subarray
// uncomment the following check:

//if (maxi < 0) maxi = 0;

return maxi; */
