package HeapSort;
//Max-Heap Example where Big value would be at the end of array
public class HeapSortAlgo {
	
	static void print_array(int A[])
	   {
	       int n = A.length;
	       for (int i=0; i<n; ++i)
	           System.out.print(A[i]+" ");
	       System.out.println();
	   }
	
	public void sort(int A[])
	   {
	       int n = A.length;

	       // Build One Time Heap (rearrange array)
	       for (int i = n-1 / 2; i >= 0; i--)
	           heapify(A, n, i);  
	      
	       // One by one extract an element from heap
	       for (int i=n-1; i>=0;i--)
	       {
	           // Move current root to end
	           int temporary = A[0];
	           A[0] = A[i];
	           A[i] = temporary;

	           // call max heapify on the reduced heap
	           heapify(A, i, 0); // doubt why heapipy happening without reducing i
	       }
	   }
	
	// right child always be greatest than left child to make Max Heap property
	void heapify(int A[], int n, int i)
	   {
	       int largest = i; // Initialize largest as root
	       int left_child = 2*i + 1; // left = 2*i + 1
	       int right_child = 2*i + 2; // right = 2*i + 2

	       // If right child is larger than largest so far 
	       if (right_child < n && A[right_child] > A[largest])
	           largest = right_child;
	       
	       // If left child is larger than root
	       if (left_child < n && A[left_child] > A[largest])
	           largest = left_child;

	 
	       // If largest is not root (Means No Left or right child)
	       if (largest != i)
	       {
	           int swap = A[i];
	           A[i] = A[largest];
	           A[largest] = swap;

	           // Recursively heapify the affected sub-tree
	           heapify(A, n, largest);
	       }
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {4,4,6,3,3,6};
	       int n = A.length;

	       HeapSortAlgo ob = new HeapSortAlgo();
	       ob.sort(A);

	       System.out.println("Sorted array is");
	       print_array(A);
	}
}
