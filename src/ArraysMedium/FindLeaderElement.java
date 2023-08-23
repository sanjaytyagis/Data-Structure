package ArraysMedium;
import java.util.*;
/* Approach 1 two for loop and compare if any lement is greater than at right hand side so element is not leader
   Approach 2 use two pinter and start from right hand side because leader is that element,
   for which all elements in right side are small than leader */

public class FindLeaderElement {

	public static ArrayList<Integer> 
    printLeadersBruteForce(int[] arr, int n){

		ArrayList<Integer> ans= new ArrayList<>();

		// Last element of an array is always a leader,
		// push into ans array.
		int max = arr[n - 1];

		ans.add(arr[n-1]);

		// Start checking from the end whether a number is greater
		// than max no. from right, hence leader.
		for (int i = n - 2; i >= 0; i--)
			if (arr[i] > max) {
				ans.add(arr[i]);
				max = arr[i];
			}

		return ans;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Initialization.
		  int n = 6;
		  int arr[]=  {10, 22, 12, 3, 0, 6};
		  ArrayList<Integer> ans= printLeadersBruteForce(arr,n);
		  
		  Collections.sort(ans, Collections.reverseOrder());
		  for (int i = 0; i < ans.size(); i++) {
		    System.out.print(ans.get(i)+" ");
		  }
	}

}
