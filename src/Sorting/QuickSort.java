package Sorting;
import java.util.*;
public class QuickSort {
//At each step, we divide the whole array, for that logN and n steps are taken for the partition()
	static int partition(List<Integer> arr, int low, int high) {
		
        int pivot = arr.get(low); // make first letter pivot every element
        int i = low;
        int j = high;

        while (i < j) 
        { // this loop will run until unless all pivot element positions are fixed
        	
            while (arr.get(i) <= pivot && i <= high - 1)
                i++;
            
            while (arr.get(j) > pivot && j >= low + 1)
                j--;
            
            if (i < j) 
            {
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
            qs(arr, low, pIndex - 1); // pivot element is already at right pos, so we need to take less than 1 index from pivot
            qs(arr, pIndex + 1, high);
        }
    }
	
	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(new Integer[] {2,1});
		int low =0, high = arr.size()-1;
		qs(arr,low,high);
		System.out.println(arr.toString());
	}
}
