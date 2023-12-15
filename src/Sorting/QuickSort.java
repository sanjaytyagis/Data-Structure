package Sorting;
import java.util.*;
public class QuickSort {

	static int partition(List<Integer> arr, int low, int high) {
		
        int pivot = arr.get(low); // make first letter pivot every element
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
	
	static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
	
	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
		int low =0, high = arr.size()-1;
		qs(arr,low,high);
		System.out.println(arr.toString());
	}
}
