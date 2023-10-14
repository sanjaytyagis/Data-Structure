package Maths;
/*
Time complexity: O(√n) (int i = 2; i <= Math.sqrt(n); i++)
Space complexity: O(1)
 */
public class PrimeNumber {

	static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to sqrt(n) 
        for (int i = 2; i*i <= n; i++) { 
            if (n % i == 0) 
                return false; 
        }
  
        return true; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PrimeNumber.isPrime(4));
	}

}
