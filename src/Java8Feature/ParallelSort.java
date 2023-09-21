package Java8Feature;
import java.util.*;

/*The parallelSort() method is introduced in the Array class of java.util package. 
It uses the concept of multithreading in order to sort the array faster.
It first goes on dividing the array into subarrays, these subarrays are sorted individually by multiple threads and then merged together. */

public class ParallelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char []a = new char[5];
		//System.out.println(a[0]);
		
		StringBuilder sb =  new StringBuilder("Sanjay Good Boy");
		//System.out.println(sb.reverse().toString());
		
		String a ="abc";
		String b = "abcd";
		System.out.println(b.compareTo(a));
		
		String[] nums = {"673","982","82","149","102","4873","6241","9572","511"};
        //Sorting array
        Arrays.parallelSort(nums);
        //using stream to print values
        Arrays.stream(nums).forEach(n->System.out.print(n+" "));
        
	}
}
