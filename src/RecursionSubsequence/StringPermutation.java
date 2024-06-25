package RecursionSubsequence;
import java.util.*;

public class StringPermutation {
	
	private static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
	
static  List < List < Integer >> ans = new ArrayList < > ();


	private static List <List< Integer >> recurPermute(int index, int[] nums, List <List< Integer >> ans) {
		
        if (index == nums.length) {
            // copy the ds to ans
        	
            List < Integer > ds = new ArrayList < > (); // to collect element into the list

            for (int i = 0; i < nums.length; i++) 
                ds.add(nums[i]);
            
            ans.add(new ArrayList(ds)); // add element in result list
            return ans;
        }
        // index is the level of tree and each level we have to swap with other elements due to which we are using loop
        for (int i = index; i < nums.length; i++) { // i in loop used to swap element with index fixed pos and i change every time
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums); // ReSwap to get the original array element 
        }
        return ans;
    }
     
	public static void main(String[] args) {
		  int nums[] = {0,1,2};
		  	StringPermutation sol = new StringPermutation();
	        List < List < Integer >> ls =  recurPermute(0, nums, ans);
	        
	        System.out.println("All Permutations are ");
	        System.out.println(ls.toString());
	        
	}

}
