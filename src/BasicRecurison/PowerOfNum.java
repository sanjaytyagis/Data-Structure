package BasicRecurison;

public class PowerOfNum {
	/*
	 Optimal Solution
	  if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
	 */
	public static double myPow(double x, int n) {
        double result = 0.0;
        if(n==0)
        return 1;

        if(n<0){
            int c = Math.abs(n); // If power is negative the do absolute and divide answer by 1
         result = (1 / (x * myPow(x,c-1)));
        }
        
        if(n>0)
         result =  x * myPow(x,n-1);

        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowerOfNum.myPow(0.00001,2147483647));
	}

}
