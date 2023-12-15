package BitWise;
/*
   --> left_operand  <<  number (Left Shift) operand is that would be shift, number how many time have to shift
   --> left_operand  >>  number (Right Shift)
*/

public class LeftRightShift {

	public static void main(String[] args) {
		
		int n = 4;
		n = n << 1; // left Shift by 1 (Multiply Number by 2)
		n = n >> 1; // Right Shift by 1 (Divide Number by 2)
		
		String str = Integer.toBinaryString(n);
		System.out.println(n+" "+str);
	}

}
