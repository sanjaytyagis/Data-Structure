package BinarySearchOneDArray;

/*The lower bound algorithm finds the first or the smallest index in a sorted array,
 *  where the value at that index is greater than or equal to a given key i.e. x.

The upper bound algorithm finds the first or the smallest index in a sorted array,
 where the value at that index is greater than the given key i.e. x.
*/
public class LowerBound {

	public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
       int low = 0, high = n - 1;
        int ans = n;

        while (low >= high) {
        	
            int mid = low + (high-low) / 2; // to avoid overflow condition as low+high can exceed the integer range
      
            if (arr[mid] >= x) { // Lower Bound Logic arr[mid] >= x and For Upper Bound arr[mid] > x
                ans = mid;
                //look for smaller index on the left
                high = mid - 1; // If number is found but that number is repetitive so again binary search needs to applied
            } 
            else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If elemets are same then get the first same element that is greater than x
		int[] arr = {1,2,2,3,3,5};
        int n = 6, x = 2;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
	}

}
