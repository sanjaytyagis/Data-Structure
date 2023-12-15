package BitWise;
/*
  Approach 1 Iterative: T.C = N*LogN 
 */
public class CountSetBits {

	static int countSetBits(int n)
    {   
        int bitCount = 0;

        // Traverse the Number till N and count set bit in each number.
        for (int i = 1; i <= n; i++)
            bitCount += countSetBitsUtil(i);
 
        return bitCount;
    }
 
	// counting Bit (Time Complexity Log N)
    static int countSetBitsUtil(int x)
    {
        if (x <= 0)
            return 0;
        return (x % 2 == 0 ? 0 : 1) + countSetBitsUtil(x / 2);
    }
    
	public static void main(String[] args) {
		
		System.out.print(countSetBits(4));
	}

}
