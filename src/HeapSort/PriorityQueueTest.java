package HeapSort;
import java.util.*;


public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> descending  = new PriorityQueue<Integer>(Collections.reverseOrder()); // follows Max-Heap
		
		descending.add(10);
		descending.add(20);
		descending.add(15);
		descending.add(5);
		
		System.out.println(descending.poll());
		
		// Using Lambda PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>((a, b) -> b - a);
		
				/*
		 PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>( new Comparator<Integer>() {
		                   
		                    public int compare(Integer a, Integer b)
		                    {
		                        if (a < b)
		                            return 1;
		                        if (a > b)
		                            return -1;
		                        return 0;
		                    }
		                });
				 */
		
		
		PriorityQueue<Integer> ascending  = new PriorityQueue<Integer>(); // Follows Min-Heap;
		ascending.add(10);
		ascending.add(20);
		ascending.add(15);
		ascending.add(5);
		
		System.out.println(ascending.poll());
		
		
		
	}

}
