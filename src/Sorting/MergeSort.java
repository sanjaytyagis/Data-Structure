package Sorting;
import java.util.*;

public class MergeSort {

	private static void merge(int[] arr, int low, int mid, int high) {
		
      List<Integer> temp = new ArrayList<>(); // temporary array
      
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
        	// To maintain actual low and high indexing to the temp array so that temp start from 0 and increase every time by 1
        	arr[i] = temp.get(i - low); 
        }
    }
	
	public static void mergeSort(int[] arr, int low, int high) {
		
        if (low >= high)
        	return;
        int mid = (low + high) / 2 ;// Base condition thought when one element would be left in last
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
		MergeSort.mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
