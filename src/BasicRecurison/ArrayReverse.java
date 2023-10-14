package BasicRecurison;
import java.util.*;

 public class ArrayReverse {

	public static int[] reverseArray(int []arr, int i,int j) {
		
        if(i>j)
        return arr;
        
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        
        int sum[] =  reverseArray(arr,i,j);
        return sum;
    }
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int result[] = ArrayReverse.reverseArray(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(result));
	}
}
