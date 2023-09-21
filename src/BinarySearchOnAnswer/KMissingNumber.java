package BinarySearchOnAnswer;

public class KMissingNumber {

	public static int missingK(int[] vec, int n, int k) {
		/*
        for (int i = 0; i < n; i++) {
            if (vec[i] <= k) {
            	int val = vec[i];
            	k++; //shifting k
            }
            else break;
        }
        return k;
     */
		//********** Bit Tricky Optmisation 
		//Binary Search First we need to find fist and second element in which Kth Missing Number could be available.
		 int low = 0, high = n - 1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int missing = vec[mid] - (mid + 1);
	            if (missing < k) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return k + high + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int[] vec = {2, 4, 5, 7 };
	        int n = 4, k = 3;
	        int ans = missingK(vec, n, k);
	        System.out.println("The missing number is: " + ans);
	}

}
