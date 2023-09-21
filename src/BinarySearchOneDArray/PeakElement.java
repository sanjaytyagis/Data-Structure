package BinarySearchOneDArray;
import java.util.*;

/*
 Always assume ob both side lowest is -infinity, beacause for 1 element in the array peak is that element only
 {1,2,3,4,5,6,7,8,5,1}
 {1,2,1,3,5,6,4}
 {1, 2, 3, 4, 5}
 {5, 4, 3, 2, 1}
 
 // Brute Force approach
	public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of array.

        for (int i = 0; i < n; i++) {
            // Checking for the peak:
            if ((i == 0 || arr.get(i - 1) < arr.get(i))
                    && (i == n - 1 || arr.get(i) > arr.get(i + 1))) {
                return i;
            }
        }
        // Dummy return statement
        return -1;
    }
	
 */
public class PeakElement {

	// Optimal Approach
	public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of array

        // Edge cases:
        //if (n == 1) return 0;
        //if (arr.get(0) > arr.get(1)) return 0;
        //if (arr.get(n - 1) > arr.get(n - 2)) return n - 1; // 1,2,3,4,5 edge case example

        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] is the peak:
            if ( ( mid == 0 || arr.get(mid - 1) < arr.get(mid) ) && (mid == n-1 || arr.get(mid) > arr.get(mid + 1) ))
                return mid;

            // If we are in the left:
            if (arr.get(mid) > arr.get(mid - 1)) 
            	low = mid + 1;

            // If we are in the right:
            // Or, arr[mid] is a common point:
            else
            	high = mid - 1;
        }
        // Dummy return statement
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr =
	            new ArrayList<>(Arrays.asList(1,8,1,5,3));
	        int ans = findPeakElement(arr);
	        System.out.println("The peak is at index: " + ans);
	}

}
