package Sorting;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
	
	static void printArray(int[] arr) {
        for (int value : arr) 
            System.out.print(value + " ");
        
        System.out.println();
    }
	
	public static void main(String[] args) {
		
		int arr[] = {5,2,6,3,4,1};
		bubbleSort(arr);
		printArray(arr);
	}

}
