package DynamicProgrammingString;

import java.util.*;

// First find Longest common subsequence and then using matrix print that length
public class PrintLongestCommonSubsequence {

	static void lcs(String s1, String s2) {
	    
		// Logic To Find length of Longest Subsequence
	    int n=s1.length();
	    int m=s2.length();

	    int dp[][]=new int[n+1][m+1];
	    for(int i=0;i<=n;i++){
	        dp[i][0] = 0;
	    }
	    for(int i=0;i<=m;i++){
	        dp[0][i] = 0;
	    }
	    
	    for(int ind1=1;ind1<=n;ind1++){
	        for(int ind2=1;ind2<=m;ind2++){
	            if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
	                dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
	            else
	                dp[ind1][ind2] = 0 + Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
	        }
	    }
	    
// ##################### Logic To Print Longest Subsequence ##########################
// for printing where you find the answer from there start and reach till oppositre end of array	    
	    int len= dp[n][m]; // length of longest sub sequence string
	    int i=n, j=m;
	    
	    int index = len-1; // to store the longest subsequence string
	    String dunmmy="";
	    
	    for(int k=1; k<=len;k++){
	    	dunmmy +="$"; // dummy string
	    }

	    StringBuilder output = new StringBuilder(dunmmy);
	    
	    while(i>0 && j>0){ // if any of the string gets over then no need to run the loop
	    	
	        if(s1.charAt(i-1) == s2.charAt(j-1)){
	        	output.setCharAt(index,s1.charAt(i-1) ); 
	            index--;
	            i--;
	            j--;
	        }
// to compare in dp array any diagonal value is greater the move that side because dp array stored largest
	        else if(dp[i-1][j] > dp[i][j-1]){ 
	            i--;
	        }
	        else j--;
	    }
	    System.out.println(output);
	}
	
	public static void main(String[] args) {
		
		String s1= "ade";
		  String s2= "abe";
		                                 
		  System.out.print("The Longest Common Subsequence is ");
		  lcs(s1,s2);
	}
}
