package Stack;
import java.util.*;
/*
   Approach 1 -> Find left and right area for every Index 0(N2)
   
   Approach 2 -> Using Stack find smallest Prefix and Suffix for every element
   
   Approach3 -> Find left and right Half in one loop 
   public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack < Integer > st = new Stack < > ();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        
        // Find the Smallest Element in left Half from the given index
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) 
            	leftSmall[i] = 0;
            else 
            	leftSmall[i] = st.peek() + 1;
            st.push(i);
        }

        // clear the stack to be re-used
        while (!st.isEmpty()) st.pop();

     // Find the Smallest Element in Right Half from the given index
        for (int i = n - 1; i >= 0; i--) {
        	
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) 
            	rightSmall[i] = n - 1;
            else 
            	rightSmall[i] = st.peek() - 1;

            st.push(i);
        }

        int maxA = 0;
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;

    }
 */
public class LargestRectangleInHistogram {
	
	public static int largestRectangleArea(int[] heights) {
		Stack < Integer > st = new Stack();
        int maxA = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
        	
        	// This loop will tell you your left and right small element for each iteration
            while (!st.empty() && (i == n || heights[st.peek()] >= heights[i])) {
            	
                int height = heights[st.peek()];
                st.pop();
                
                int width;
                
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
