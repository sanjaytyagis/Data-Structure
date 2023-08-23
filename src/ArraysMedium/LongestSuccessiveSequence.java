package ArraysMedium;
import java.util.*;

/*
 Approach1 use two for loop one for element iterate and second for search next element in the array
 Approach 2 Sort the element
 Approach 3 Use Set to avoid sequence
 */
public class LongestSuccessiveSequence {

	public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {100, 200, 1, 2, 3, 4};
	        int ans = longestSuccessiveElements(a);
	        System.out.println("The longest consecutive sequence is " + ans);
	}

}
