package DynamicProgramming1D;
import java.util.*;
// 0 to 0 jump means no energy loss

/* Memonisation
 
    static int solve(int ind, int[] height, int[] dp){
		
	    if(ind==0)
	    	return 0;
	    
	    if(dp[ind]!=-1) 
	    	return dp[ind];
	 
	    // if left will calculated some value then right should greater to compare and get min value	    
	    int jumpTwo = Integer.MAX_VALUE; 
	    
	    int jumpOne= solve(ind-1, height,dp)+ Math.abs(height[ind]-height[ind-1]);
	    
	    if(ind>1)
	        jumpTwo = solve(ind-2, height,dp)+ Math.abs(height[ind]-height[ind-2]);
	    
	     dp[ind] = Math.min(jumpOne, jumpTwo);
	    
	     return dp[ind];
	}
	
	int height[] = {10,20,30,10};
		  int n= height.length;
		  int dp[] = new int[n];
		  Arrays.fill(dp,-1);
		  
		  System.out.println(solve(n-1,height,dp));
 */

 public class FrogJumps {
	
	// Tabulation
	static int solve(int n, int[] height, int[] dp){
	 
		for(int ind = 1; ind < n; ind++)
		{
		      int jumpTwo = Integer.MAX_VALUE;
		      
		        int jumpOne= dp[ind-1] + Math.abs(height[ind]-height[ind-1]);
		        
		        if(ind>1)
		            jumpTwo = dp[ind-2] + Math.abs(height[ind]-height[ind-2]);
		    
		        dp[ind] = Math.min(jumpOne, jumpTwo);
		  }
		  return dp[n-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int height[] = {10,20,30,10};
		  int n=height.length;
		  int dp[]=new int[n];
		  Arrays.fill(dp,-1);
		  dp[0]=0;
		  System.out.println(solve(n,height,dp));
	}
}
