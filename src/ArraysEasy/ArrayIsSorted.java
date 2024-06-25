package ArraysEasy;
import java.util.*;
public class ArrayIsSorted {

	public static int isSorted(int []input) {
        // Write your code here.
		
        int i =0, n= input.length;
        
        for(i=0;i<n-1; i++){
            if(input[i]>input[i+1])
             break;
        }

        if(i>=n-1)
         return 1;
        
         return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {1,4,2,5,3};
		System.out.println(input.length);
		int result = ArrayIsSorted.isSorted(input);
		System.out.println(result);
	}

}
