package RecursionSubsequence;
import java.util.*;
/* 
  //My Logic for String
 static void solve(int i, String s, String f) {
		
		if (i == s.length()) {
			System.out.print(f+" ");
			return;
		}
		
		solve(i + 1, s,  f); // Exclude Call
		solve(i + 1, s,  f+s.charAt(i)); // Include call
		
	}
	
 */
public class StringSubSequence {
	
	 static List<List<Integer>> result = new ArrayList();

	public static void printSubsequences(int index, int[] arr, List<Integer> seq)
	{
		int sum = 0;
		if (index == arr.length)
		{
			
			//if (seq.size() > 0)          // Condition to avoid printing empty subsequence
				//System.out.print(seq+" ");
			
			for(Integer i: seq) {
				sum+=i;
			}
			
			List<Integer> ob = new ArrayList<Integer>(seq);
			
			Collections.sort(ob);
			 
		// Logic to print sequence equal to K and to avoid duplicate sequence but order can vary like 1,2 & 2,1 can exist
			if(sum==3 && !result.contains(ob)) 
			result.add(new ArrayList<Integer>(seq)); // Important Logic to add each list element into new list
			
			return;
		}
		
		     seq.add(arr[index]);
			printSubsequences(index + 1, arr, seq); 
			
			//seq.add(arr[index]); // to print in the reverse order

			seq.remove(seq.size() - 1);	
			printSubsequences(index + 1, arr, seq); 
			
			//seq.remove(seq.size() - 1);	// to print in the reverse order
	}
	
	public static void main(String[] args) {
		// TODO Auto generated method stub
		int[] arr = {1,2,3,4}; // input = 1,2,3,1,1,1
		List<Integer> seq = new ArrayList<>();
		
	    printSubsequences(0, arr, seq);
	    
	    System.out.println();
	    System.out.println(result.toString());
  
	}
}
