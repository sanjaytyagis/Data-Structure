package BitWise;

/*
  For Even Number last bit always be 0 and Odd Number last bit would be 1
  And of (num with 1) gives result "1" it means Odd if result "0" then Even 
 */
public class EvenOdd {

	public static boolean isEvenOdd(int n) {
	    
      return (n & 1) == 0 ? true : false;
        
    }
	
	public static void main(String[] args) {
		System.out.println(isEvenOdd(5));
	}

}
