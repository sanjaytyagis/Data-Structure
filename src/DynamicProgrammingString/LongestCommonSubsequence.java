package DynamicProgrammingString;
import java.util.*;

/* For example, "ace" is a subsequence of "abcde"
Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.

// Memoisation
static int lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp) {
        // Base case: If either of the strings reaches the end, return 0
        if (ind1 < 0 || ind2 < 0)
            return 0;

        // If the result for this subproblem has already been calculated, return it
        if (dp[ind1][ind2] != -1)
            return dp[ind1][ind2];

        // If the characters at the current indices are the same, increment the LCS length
        if (s1.charAt(ind1) == s2.charAt(ind2))
            return dp[ind1][ind2] = 1 + lcsUtil(s1, s2, ind1 - 1, ind2 - 1, dp);

        // If the characters are different, choose the maximum LCS length by either
        // skipping a character in s1 or skipping a character in s2
        else
            return dp[ind1][ind2] = Math.max(lcsUtil(s1, s2, ind1, ind2 - 1, dp),
                    lcsUtil(s1, s2, ind1 - 1, ind2, dp));
    }
*/
public class LongestCommonSubsequence {
// Tabulation
	static int lcs(String s1, String s2) {
		
        int n = s1.length();
        int m = s2.length();

 int dp[][] = new int[n + 1][m + 1]; // n+1 or m+1 because base condition is -1 that is not possible

        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        // Initialize the first row and first column with zeros since LCS with an empty string is zero
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        for (int ind1 = 1; ind1 <= n; ind1++) {
        	
            for (int ind2 = 1; ind2 <= m; ind2++) {
                // If the characters at the current indices are the same, increment the LCS length
            	if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                // If the characters are different, choose the maximum LCS length by either
                // excluding a character in s1 or excluding a character in s2
                else
                    dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }

        return dp[n][m]; // Return the length of the Longest Common Subsequence (LCS)
    }
	public static void main(String[] args) {
		
		String s1 = "abc";
        String s2 = "bca";

        int n = s1.length();
        int m = s2.length();

        // Create a 2D array to store results of subproblems
        int dp[][] = new int[n][m];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        //System.out.println(lcsUtil(s1, s2, n - 1, m - 1, dp));
        int out = lcs(s1, s2);
        System.out.println(out);
	}
}
