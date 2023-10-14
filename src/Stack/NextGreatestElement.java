package Stack;
import java.util.*;

/* Next greatest in circular order as well like if element at index 5 
so it will check ahead 5th index and once reached end of array check in circular till 4th index as well
*/

public class NextGreatestElement {

	public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        
        Stack < Integer > st = new Stack < > ();
        
        // Keep i = 2*n-1 for circular array and Keep i= n-1 for non circular array
        // Also to understand take three elements logic [6,1,4] then you will understand what will happen
        
        for (int i = 2*n - 1; i >= 0; i--) {
        	
            while (!st.isEmpty() &&  nums[i % n] >= st.peek()) {
                st.pop();
            }

            if (i < n) {
                if (!st.isEmpty())
                	ans[i] = st.peek();
                else 
                	ans[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,10,4,2,1,2,6,1,7,2,9};

        int arr2[] = nextGreaterElements(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
	}

}
