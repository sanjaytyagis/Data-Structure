package Stack;

/*
Here In Each and Every rows add the upper rows element and then find largest histogram in each and every row
Input: matrix = 
[["1","0","1","0","0"]
["1","0","1","1","1"]
["1","1","1","1","1"]
["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.

 */
public class MaximumRectangle {

	public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) 
        	return 0;
        int maxArea = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dp = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dp[j] = matrix[i][j] == '1' ? dp[j]+1 : 0;
            }
            //treating dp[j] as histogram, find max area of every row from largest histogram logic
            maxArea = Math.max(maxArea, LargestRectangleInHistogram.largestRectangleArea(dp));
        }
        return maxArea;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
