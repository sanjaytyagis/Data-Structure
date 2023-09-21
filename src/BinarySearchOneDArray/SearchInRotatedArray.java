package BinarySearchOneDArray;

public class SearchInRotatedArray {

	public static int search(int arr[], int n, int k) {
        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;

            // if mid points to the target
            if (arr[mid] == k)
                return mid;

          //Edge case: difficult to find the left part mid element belong to or right part
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            
  // Rotated array Logic started from here in Binary Search  
            
            // if left part is sorted or mid element belong to left part or right part
            if (arr[low] <= arr[mid]) {
            	
                if (arr[low] <= k && k <= arr[mid]){
                    // element exists
                    high = mid - 1;
                }else {
                    // element does not exist
                    low = mid + 1;
                }
            }
            else { // if right part is sorted
                if (arr[mid] <= k && k <= arr[high]) {
                    // element exists
                    low = mid + 1;
                } else {
                    // element does not exist
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = 9, k = 1;
        int ans = search(arr, n, k);
        System.out.println("The lower bound is the index: " + ans);
	}
}
