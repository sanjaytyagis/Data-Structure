package BinarySearchOneDArray;

public class BinarySearch {

	public static int search(int []nums, int target) {
        // Write your code here.
        int start = 0, end = nums.length-1;

        while(start <= end){
        	int mid = start + (end-start) / 2;
            
            if(nums[mid]==target)
                return mid;
            else if(nums[mid] > target)
                end = mid-1;
            else
                start = mid+1;
        }
        
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
	}

}
