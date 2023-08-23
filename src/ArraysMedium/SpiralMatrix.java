package ArraysMedium;
import java.util.*;

public class SpiralMatrix {


    public static int[] printSpiral(int[][] mat) {
        
        int n = mat.length; // no. of rows
        int m = mat[0].length; // no. of columns
        int count = 0;
        int total = n*m;
        
        // Define ans list to store the result.
        int ans[] = new int[total];
        
        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        // Loop until all elements are not traversed.
        while (count < total) {

            // For moving left to right
            for (int i = left; i <= right; i++) {
                ans[count] = mat[top][i];
                count++;
            }

            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++) {
            	ans[count] = mat[i][right];
            	count++;
            }
            
            right--;

            // For moving right to left.
 
                for (int i = right;count < total && i >= left; i--) {
                	ans[count] = mat[bottom][i];
                count++;
                }
        
                bottom--;
  
            // For moving bottom to top.
                for (int i = bottom;count < total && i >= top; i--) {
                	ans[count] = mat[i][left];
                count++;
                }
                
                left++;
        }
        return ans;
}
	
	public static void main(String[] args) {
		
		//Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        int ans[] = printSpiral(mat);

        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println();
	}

}
//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 