package ArraysEasy;
import java.util.*;

// Approach 1 count zero and non zero

// Approach 2 optimize two pointer

// Approach 3rd two pinter, find first zero in array and then play with two pointer

public class MoveZerosToEnd {

	public static int[] moveZeros(int []a, int n) {
        // Write your code here.
		int res[] = new int[n];
        int j=0;
        
        // count Non Zeros element and add in another array
        for(int i=0; i<n ; i++){
            if(a[i]!=0){
              res[j]= a[i];
              j++;
            } 
        }
        
        // rest space in the array put zero
        while(j<n){
           res[j]=0;
           j++;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {0,0,0,1};
		MoveZerosToEnd.moveZeros(input,input.length);
		System.out.println(Arrays.toString(input));
	}
}

/* Approach-2
public static int[] moveZeros(int []a, int n) {

    int i=0, j=1;
    
    while(i<n && j<n){

        if(i<n && j<n && a[i] != a[j] && a[i]!=0){
            i++;
            j++;
            System.out.println("Value I "+i+" Value J "+j);
        }

        if(i<n && j<n && a[i] == a[j] && a[i]==0) {
            j++;
            System.out.println("Value I "+i+" Value J "+j);
        }
        
        if(i<n && j<n && a[i]!=a[j] && a[i]==0){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            System.out.println("Value I "+i+" Value J "+j);
        }
    }
    return a;
}
*/