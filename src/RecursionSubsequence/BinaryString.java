package RecursionSubsequence;
/* Binary strings with no consecutive 1s.

Time Complexity: O(2^n),as we can see that we are calling the recursive function two times for every recursion level.
Hence, the time complexity is 2^n.

Space Complexity: O(n) since we are using a boolean array of size n.

*/
import java.util.*;

public class BinaryString {

	public static ArrayList<String> generateBinaryStrings(int n) {
		ArrayList<String> result = new ArrayList<String>();
		
		 if (n == 0) {
		      ArrayList<String> emptyList = new ArrayList<String>();
		      emptyList.add("0");
		      return emptyList;
		    }
		    
		    if (n == 1) {
		      ArrayList<String> list = new ArrayList<String>();
		      list.add("0");
		      list.add("1");
		      return list;
		    }
	    
	    
	    ArrayList<String> prevList = generateBinaryStrings(n - 1);
	    for (String s : prevList) {
	      result.add(s + "0");
	      if (s.charAt(s.length() - 1) != '1') {
	        result.add(s + "1");
	      }
	    }
	    return result;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> binaryStrings = generateBinaryStrings(0);
	    for (String s : binaryStrings) {
	      System.out.print(s + " ");
	    }
	}

}
