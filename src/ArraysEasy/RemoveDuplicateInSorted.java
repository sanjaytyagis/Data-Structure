package ArraysEasy;

//Approach1 use HashSet or HashMap but in O(1) space HashSet isn't allowed
// Approach 2 Pointer to save Memory Space

public class RemoveDuplicateInSorted {

	// Remove Duplicate in Sorted Array only
	static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.print(k);
	}

}
