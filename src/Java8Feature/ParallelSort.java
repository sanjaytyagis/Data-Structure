package Java8Feature;
import java.util.*;

/*The parallelSort() method is introduced in the Array class of java.util package. 
It uses the concept of multithreading in order to sort the array faster.
It first goes on dividing the array into subarrays, these subarrays are sorted individually by multiple threads and then merged together. */

public class ParallelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{673,982,82,749,102,4873,6241,9572,511};
        //Sorting array
        Arrays.parallelSort(nums);
        //using stream to print values
        Arrays.stream(nums).forEach(n->System.out.print(n+" "));
        
	}
}
