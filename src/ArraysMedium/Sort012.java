package ArraysMedium;
import java.util.*;

import ArraysEasy.ArrayIsSorted;

/*Dutch National Flag Algo to sort the three element in ascending order
 */
public class Sort012 {

	public static void sortArray(ArrayList<Integer> arr, int n) {
	       int low = 0, mid = 0, high = n - 1; // 3 pointers

	        while (mid <= high) {
	        	
	            if (arr.get(mid) == 0) {
	                // swapping arr[low] and arr[mid]
	                int temp = arr.get(low);
	                Collections.swap(arr,low,mid);
	                low++;
	                mid++;

	            } else if (arr.get(mid) == 1) {
	                mid++;

	            } else {
	                // swapping arr[mid] and arr[high]
	                int temp = arr.get(mid);
	                Collections.swap(arr,mid,high);
	                high--;
	            }
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,2,0,0,1};
		
		int n = input.length;
		//int result = Sort012.sortArray(input,n);
		//System.out.println(result);
	}

}
