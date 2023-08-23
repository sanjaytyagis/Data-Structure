package ArraysEasy;
import java.util.*;

/* result.get(result.size() -1) != a[i] checking to avoid duplicay like if 
last element in arraylist is 2 and current elewment is also 2 so don't add in output arraylist

i<firstlen && j<secondlen to avoid array index out of bound exception
*/

public class MergeTwoSortedArray {

	public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
		int firstlen = a.length;
        int secondlen = b.length;
        int i=0, j=0;
        List<Integer> result = new ArrayList(); 

        while(i<firstlen && j<secondlen){

        	 // Insert first array element
            if((i<firstlen && j<secondlen) && (a[i]<=b[j])){

                if(result.size() == 0 || result.get(result.size() -1) != a[i])
                    result.add(a[i]);

                i++;
            }
            
            // Insert second array element
            if((i<firstlen && j<secondlen) && (a[i]>b[j])){

                if(result.size() == 0 || result.get(result.size()-1) != b[j])
                    result.add(b[j]);

                j++;
            }
        }
        
        //remaining element in first array
        while(i<firstlen){

           if(result.get(result.size() -1) != a[i])
                    result.add(a[i]);

                i++;
        }
        
        //remaining element in Second array
        while(j<secondlen){
            if(result.get(result.size()-1) != b[j])
                    result.add(b[j]);

                j++;
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3};
		int b[] = {2,2,4};
        List<Integer> output = MergeTwoSortedArray.sortedArray(a,b);
        System.out.print(output.toString());
	}

}
