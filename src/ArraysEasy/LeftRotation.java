package ArraysEasy;
import java.util.*;
// If Left Rotation of string is required x moves then Right Rotation will be (n-x) moves where n is length of string
// d:- no of rotation, n:- array element
// left shift (i+(n-d))%n 
// right shift (i+(n-1-d))%n

public class LeftRotation {

	public void Reverse(int arr[], int start, int end){
        while (start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        //Reverse till k-1
        Reverse(nums, 0, k - 1);
        // Reverse last n-k elements
        Reverse(nums, k, n - 1);
        // Reverse whole array
        Reverse(nums, 0, n - 1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,-100,3,99};
        new LeftRotation().rotate(arr,2);
        System.out.print(Arrays.toString(arr));
	}
}
