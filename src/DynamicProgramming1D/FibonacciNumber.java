package DynamicProgramming1D;
import java.util.Arrays;

/* 
  
 [1] Memonisation -> avoid recursive function call

Time Complexity: O(N)
Reason: The overlapping subproblems will return the answer in constant time O(1).
 Therefore the total number of new subproblems we solve is ‘n’. Hence total time complexity is O(N).

Space Complexity: O(N)
Reason: We are using a recursion stack space(O(N)) and an array (again O(N)). 
Therefore total space complexity will be O(N) + O(N) ≈ O(N)

[2] Tabulation - Bottom-Up approach prr work karega

  int n=5;
  int dp[]=new int[n+1];
  Arrays.fill(dp,-1);
  dp[0]= 0;
  dp[1]= 1;
  
  for(int i=2; i<=n; i++){
      dp[i] = dp[i-1]+ dp[i-2];
  }
  System.out.println(dp[n]);
  
  T.C = 0(N)
  S.C = 0(N)
 */
public class FibonacciNumber {

	static int fib(int n, int[] dp){
		
	    if(n<=1)
	    	return n;
	    
	    if(dp[n]!= -1) 
	    	return dp[n];
	    
	    return dp[n]= fib(n-1,dp) + fib(n-2,dp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			// because at 0 index we have 1 element and if we want 1 element fibnocci then it showuld be 1 instead of 0
		  int dp[]=new int[n+1]; 
		  Arrays.fill(dp,-1);
		  
		  System.out.println(fib(n,dp));
	}

}
