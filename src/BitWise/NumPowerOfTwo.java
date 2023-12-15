package BitWise;

/*  
  [1] // ========= O(log n base 2) =============
        // while(n>=2){
        //     if(n%2!=0) return false;
        //     n/=2;
        // }
        // return n==1;
         
  [2] Bitwise Trick
  
  Let's assume that n is power of two, it will have 1 only at the most significant bit and all others are 0.
   The number n-1 will have 1 digit less than n.
  So if we perform AND operation of n and n-1 we will get answer as 0 as the only digit in n which is 1 will ANDed with 0.

 */
public class NumPowerOfTwo {

	 // Question -> Given an integer n, return true if it is a power of two. Otherwise, return false.
	
	public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
   }
	public static void main(String[] args) {
		
		System.out.println(isPowerOfTwo(5));
	}

}
