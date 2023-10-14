package Stack;
/*
  Approach 1 Brute Force at each and every index calculate this formula rightMax = Math.max(rightMax, arr[j]);
  
  Approach 2 The complexity can be boiled down to O(1) if we precompute the leftMax and rightMax at each index.
  
  // Approach 1 code
  static int trap(int[] arr) {
        int n = arr.length;
        int waterTrapped = 0;
        
        for (int i = 0; i < n; i++) {
        	
            int j = i;
            int leftMax = 0, rightMax = 0;
            
            // to get the maximum element in the left
            while (j >= 0) {
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            
            j = i;
            
            // to get the maximum element in the right
            while (j < n) {
                rightMax = Math.max(rightMax, arr[j]);
                j++;
            }
            
            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
        }
        return waterTrapped;
    }
    
    // Approach 2
	static int trap(int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        
        // Find greatest element at index for prefix 
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], arr[i]);
        }
        
        // Find smallest element at index for suffix 
        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], arr[i]);
        }
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(prefix[i], suffix[i]) - arr[i];
        }
        return waterTrapped;
    }
 */
public class TrappingRainwater {
	
	static int trap(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1, res = 0;
        int maxLeft = 0, maxRight = 0;
        
        while (left <= right) {
        	
            if (arr[left] <= arr[right]) 
            {
                if (arr[left] >= maxLeft)
                    maxLeft = arr[left];
                else 
                    res += maxLeft - arr[left];
                
                left++;
            } 
            else 
            {
                if (arr[right] >= maxRight)
                    maxRight = arr[right];
                else 
                    res += maxRight - arr[right];
                
                right--;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		 int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
	    System.out.println("The duplicate element is " + trap(arr));
	}
}
