package RecursionSubsequence;
import java.util.*;

public class SubsetSum {

	static ArrayList < Integer > subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, ArrayList < Integer > sumSubset) {
        
		if (ind == arr.size()) {
            sumSubset.add(sum);
            return sumSubset;
        }

		  // Do-not pick the element
        subsetSumsHelper(ind + 1, sum, arr, sumSubset);
        
        // pick the element 
        subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, sumSubset);

      
        return sumSubset;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList < Integer > arr = new ArrayList < > ();
		ArrayList < Integer > sumSubset = new ArrayList < > ();
		
        arr.add(3);arr.add(1);arr.add(2);
        Collections.sort(arr);
        
        ArrayList < Integer > ans = subsetSumsHelper(0, 0, arr, sumSubset);
        System.out.println(ans.toString());
        
        
	}

}
