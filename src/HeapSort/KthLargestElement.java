package HeapSort;

//Approach 1 Sorting

//Approach 2 Heap
/* If we do via heap then Time complexity would be O(n*log(k)) n for build heap of array and 
log k always heap would contain maximum k elements 

S.C = 0(k) using priority Queue for storing k element always
*/

/* Aproach 3 like Quick sort but in this we won't go for both half we will always go for half that has greatest element
 that's why T.C = 0(n)
QuickSelect (Hoare Partition) put the pivot element at n-k and then next element of pivot would be kth greatest
 */
public class KthLargestElement {

	static int partition(int[] arr, int left, int right) {
	    int pivot = arr[left];
	    int l = left + 1 ;
	    int r = right;
	    while (l <= r) {
	        if (arr[l] < pivot && arr[r] > pivot) {
	            int temp=arr[l];
	            arr[l]=arr[r];
	            arr[r]=temp;
	            l++ ;
	            r-- ;
	        }
	        if (arr[l] >= pivot) {
	            l++;
	        }
	        if (arr[r] <= pivot) {
	            r--;
	        }
	    }
	    		int temp2=arr[left];
	            arr[left]=arr[r];
	            arr[r]=temp2;
	    return r;
	}
	
	static int kth_Largest_Element(int[] arr, int k) {
		
	    int left = 0, right = arr.length - 1, kth;
	   
	    while (true) {
	        int idx = partition(arr, left, right);
	        if (idx == k - 1) {
	            kth = arr[idx];
	            break;
	        }
	        if (idx < k - 1) {
	            left = idx + 1;
	        } else {
	            right = idx - 1;
	        }
	    }
	    return kth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,2,1,5,6,4};

	    int n = arr.length, k = 2;
	    System.out.println("Kth Largest element is "+kth_Largest_Element(arr, k));
	    }
	}
