package RandomPracticeLogic;
import java.util.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> isPrime = new ArrayList(Arrays.asList(1,2,3));
		
		char ch = 'z';
		int b = ch | 32;
		
		System.out.println((char)b);
		
		List<List<Integer>> result = new ArrayList();
		
		
		List<Integer> seq1 = new ArrayList();
		seq1.add(1);seq1.add(2);seq1.add(3);
		
		List<Integer> seq2 = new ArrayList();
		seq2.add(3);seq2.add(2);seq2.add(1);
		
		result.add(seq1);
		
		//Collections.sort(seq2);
		
		if(result.contains(seq2))
		System.out.println("True");
		else
			System.out.println("False");
		
	}

}
