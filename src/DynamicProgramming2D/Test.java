package DynamicProgramming2D;

import java.lang.reflect.Array;
import java.util.*;

public class Test {

	static int dfs(int m, List<List<Integer>> triangle, int[][] dp) {

	    for (int i = 1; i < m; i++) 
	    {
	        int n = triangle.get(i).size();
	        
	        for (int j = 0; j < n; j++) 
	        {
	            int min = Integer.MAX_VALUE;
	            for(int k = n-2; k>=0; k--)
	            {
	                int sum = triangle.get(i).get(j) + dp[i - 1][k];
	                min = Math.min(min,sum);
	                dp[i][j] = min;
	            }   
	        }
	    }
	    
	    int min = Integer.MAX_VALUE;
	    for(int i = 0; i < m ; i++)
	     min = Math.min(min,dp[m-1][i]);
	    
	    for(int a[] : dp)
	    System.out.println(Arrays.toString(a));

	        return min;
}
	public static void main(String[] args) {
		
		int var = false || false ? 1 : 0;
		System.out.println(var);
		/*List<List<Integer>> triangle = new ArrayList();
		
		triangle.add(Arrays.asList(-1));
		triangle.add(Arrays.asList(2,3));
		triangle.add(Arrays.asList(1,-1,-3));
		
		 int m = triangle.size();
	     int dp[][] = new int[m][m];
	     
         dp[0][0] = triangle.get(0).get(0);
         
         System.out.println(dfs(m, triangle, dp));*/

	}

}
