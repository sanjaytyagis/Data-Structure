package DynamicProgramming1D;
import java.util.*;
/*
    You are climbing a staircase. It takes n steps to reach the top.
	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

	Input: n = 3
	Output: 3
	Explanation: There are three ways to climb to the top.
	1. 1 step + 1 step + 1 step
	2. 1 step + 2 steps
	3. 2 steps + 1 step
	
	// My Code but I missed context of question to optimise
	 int count =0;
	
	public int climbStairs(int n) {
        
        if(n==0)
           count++;
        
        if(n>=1)
        climbStairs(n-1);

        if(n>=2)
        climbStairs(n-2);
        
        return count;
    }
 */
	public class ClimbingStairs {

	// Memonisation 
	static int stairs(int[] dp, int n){
		
		int callForOne = 0, callForTwo = 0;
		
	    if(n==0)
	   return 1;
	    
	    if(dp[n]!= -1) 
	    	return dp[n];
	    
	     callForOne = stairs(dp, n-1);
	    
	      if(n>=2) // for edge case if input is 1
	      callForTwo = stairs(dp,n-2);
	    
	    dp[n] =  callForOne + callForTwo;
	    
	     return dp[n];
	}
	
	public static void main(String[] args) {
		int n = 2;
		int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        ClimbingStairs.stairs(dp,n);
        System.out.println(dp[n]);
	}
}
