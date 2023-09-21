package BinarySearchOneDArray;

// Logic:- Find Minimum Element index that will return the no of times array rotated
public class NoOfRotation {

	public static int findKRotation(int[] arr) {
		int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
 
            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
            	if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                // Eliminate left half:
                low = mid + 1;

            } else { //if right part is sorted:

                // keep the minimum:
            	if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                // Eliminate right half:
                high = mid - 1;
            }
        }
        return index;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
	        int ans = findKRotation(arr);
	        System.out.println("The array is rotated " + ans + " times.");
	}

}
