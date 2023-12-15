package RecursionSubsequence;
import java.util.*;
/*
  Generate unique combination one element can be used once in sequence, no duplicate like 1,2 and 2,1 both are same

 */
public class CombinationSumII {

public static List < List < Integer >> findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        
		if (ind == arr.length) {
            List<Integer> ob = new ArrayList<Integer>(ds);
            
          //!ans.contains(ob) -> logic for No duplicate sequence like 1,2 and 1,2 repeated sequence
            if (target == 0 && !ans.contains(ob)) {   
                ans.add(ob);
            }
            return ans;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind+1, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
        return ans;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,5,6,7,10}; // 1,1,2,5,6,7,10
Arrays.sort(arr); // to avoid 1,2 and 2,1 sequence eg input is "121" so after sort it'll be 112 and no duplicate like 12 & 21
		int target = 8;
		List < List < Integer >> ans = new ArrayList < > ();
	     List < List < Integer >> res =  CombinationSumII.findCombinations(0, arr, target, ans, new ArrayList < > ());
        System.out.println(res.toString());
	}
}
