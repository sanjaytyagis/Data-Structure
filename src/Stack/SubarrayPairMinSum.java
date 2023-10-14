package Stack;

/* My Logic Approach 1
 	Hint in every element added to window then at that time we can check that element is minimum with earlier min or not
 	
 	Approach2:- if we can find in left and right subarray given element is minimum in how many sub array 
 	then It can be optimise
 	// But failing few test cases Approach 1
  	public int sumSubarrayMins(int[] arr) {
        long sum = 0, min;
        for(int i =0; i< arr.length; i++){
            min = arr[i];
            sum = sum+min;
            for(int j =i+1; j< arr.length; j++){
                min = Math.min(arr[j],min);
                sum = sum+min;
            }
        }
        return (int)sum;
    }   
*/
public class SubarrayPairMinSum {

	public static void main(String[] args) {
		/*
Input: arr = [3,1,2,4]
Output: 17
Explanation: 
Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
Sum is 17.
		 */
		int arr[] = {3,1,2,4};
	    System.out.println("The duplicate element is ");
	}
}
