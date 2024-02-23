package DynamicProgrammingIncreasingSubSequence;
import java.util.*;

public class PrintLongestIncreaseSubSequence {

	static int longestIncreasingSubsequence(int arr[], int n){
	    
	    int[] dp=new int[n];
	    Arrays.fill(dp,1);
	    
	    int[] hash=new int[n];// it will help you to store the index of previous element of sequence
	    Arrays.fill(hash,1);
	    
	    for(int i=0; i<=n-1; i++){
	        
	        hash[i] = i; // initializing with current index
	        for(int prev_index = 0; prev_index <=i-1; prev_index ++){
	            
	            if(arr[prev_index]<arr[i] && 1 + dp[prev_index] > dp[i]){
	                dp[i] = 1 + dp[prev_index];
	                
	                hash[i] = prev_index; // store index of prev elemnt of sequence
	            }
	        }
	    }
	    // till above got the Max LIS count, from below printing logic is there
	    int ans = -1;
	    int lastIndex =-1;
	    
	    for(int i=0; i<=n-1; i++){
	        if(dp[i]> ans){
	            ans = dp[i];
	            lastIndex = i; // storing the index where max sequence number was found
	        }
	    }
	    
	    ArrayList<Integer> temp=new ArrayList<>();
	    temp.add(arr[lastIndex]);
	    
	    while(hash[lastIndex] != lastIndex){ // till not reach the initialization value (0==0)
	        lastIndex = hash[lastIndex]; // getting index store in has array
	        temp.add(0,arr[lastIndex]);    // adding that element in answer 
	    }
	    System.out.println(temp.toString());
	    
	    return ans;
	}
	public static void main(String[] args) {
		int arr[] = {10,9,2,5,3,7,101,18};
		int n = arr.length;
		longestIncreasingSubsequence(arr,n);
	}
}
