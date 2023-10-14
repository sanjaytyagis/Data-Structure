package BasicRecurison;

public class SumOfNumber {

	public static long sumFirstN(long n) {
        // Write your code here.
        if(n==0)
        return 0;
        return n+sumFirstN(n-1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfNumber.sumFirstN(3));
	}

}
