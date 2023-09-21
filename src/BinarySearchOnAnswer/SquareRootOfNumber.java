package BinarySearchOnAnswer;

/*
  Perfect Square (x*x = N) :- Number is p[erfect square if any numbers square  are equal to that number 
  Sqaure Root:- if x*x <= N :- Number less than N and square is equal or less than N
  
  // Brute force
  public static int floorSqrt(int n) {
        int ans = 0;
        // linear search on the answer space
        for (long i = 1; i*i <= n; i++) {
            ans = (int)i;
        }
        return ans;
    }
 */
public class SquareRootOfNumber {
	
	public static int floorSqrt(int n) {
        int low = 1, high = n, ans = 0;;
        
        //Binary search on the answers:
        
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            
            if (val <= (long)(n)) {
                //eliminate the left half:
                low = (int)(mid + 1);
                	ans	= (int)mid;
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
        
	}

}
