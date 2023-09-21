package BinarySearchOneDArray;

/* Approach 1:- Find the first occurrence through upper bound login,
   then to get Last occurrence get first occurrence index and iterate until it match.
 */

public class FirstLastOccurence {
	
	// Find first occurrence of given element
	public static int firstOccurence(int n, int key, int[] arr) {
	    int start = 0;
	    int end = n - 1;
	    int res = -1;

	    while (start <= end) {
	      int mid = start + (end - start) / 2;
	      if (arr[mid] == key) {
	        res = mid;
	        end = mid - 1;

	      } else if (arr[mid] > key) {
	        end = mid - 1;
	      } else {
	        start = mid + 1;
	      }
	    }
	    return res;
	  }

	// Find last occurrence of given element
	public static int lastOccurence(int n, int key, int[] arr) {
	    int start = 0;
	    int end = n - 1;
	    int res = -1;

	    while (start <= end) {
	      int mid = start + (end - start) / 2;
	      if (arr[mid] == key) {
	        res = mid;
	        start = mid + 1;

	      } else if (arr[mid] > key) {
	        end = mid - 1;
	      } else {
	        start = mid + 1;
	      }
	    }
	    return res;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
	    int key = 1;
	    int[] v = {3,4,13,13,13,20,40};

	    // returning the last occurrence index if the element is present otherwise -1
	    System.out.println(firstOccurence(n, key, v));
	    System.out.println(lastOccurence(n, key, v));
	}

}
