
package RecursionSubsequence;
import java.util.*;

public class CombinationSum {
	
	public static List < List < Integer >> findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        
		if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList < > (ds));
            }
            return ans;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
        return ans;
    }
		
	public static void main(String[] args) {
		
		int arr[] = {2,3,6,7}; // in combination same number can be repeated
        int target = 7;
        List < List < Integer >> ans = new ArrayList < > ();
        List < List < Integer >> ls =  CombinationSum.findCombinations(0, arr, target, ans, new ArrayList < > ());
        
        System.out.println(ls.toString());       
	}
}
