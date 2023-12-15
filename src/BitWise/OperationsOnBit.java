package BitWise;
import java.util.*;

/*
Setting a bit means that if bit is 0, then set it to 1 and if it is 1 then leave it unchanged
Clearing a bit means that if bit is 1, then clear it to 0 and if it is 0 then leave it unchanged        
*/

public class OperationsOnBit {

	// Get the ith bit of a number
    public static int getBit(int num, int i) {
        return (num & (1 << i)) != 0 ? 1 : 0;
   
    }

    // Set the ith bit of a number to 1
    public static int setBit(int num, int i) {
        return num | (1 << i);
    }

    // Clear the ith bit of a number
    public static int clearBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }
	
	public static void main(String[] args) {
		int number = 9; // Example number
        int i = 3; // Example bit position

        System.out.println("Original number: " + number);
        System.out.println("Value of bit at position " + i + ": " + getBit(number, i));

        int numberWithBitSet = setBit(number, i);
        System.out.println("Number with bit set at position " + i + ": " + numberWithBitSet);

        int numberWithBitCleared = clearBit(number, i);
        System.out.println("Number with bit cleared at position " + i + ": " + numberWithBitCleared);
		
	}

}
