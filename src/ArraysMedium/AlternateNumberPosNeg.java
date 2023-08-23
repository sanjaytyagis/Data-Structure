package ArraysMedium;

// + ve & -ve numbers are equal in order, print + ve & -ve numbers in alternate order
public class AlternateNumberPosNeg {

	public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int res_array[] = new int[a.length];
        int evenindex=0, oddindex=1;

        for(int i=0; i<a.length; i++){
            if(a[i]<0){
                res_array[oddindex] = a[i];
                oddindex+=2;
            }
            else{
                res_array[evenindex] = a[i];
                evenindex+=2;
            }
        }
        return res_array;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int A[]= {1,2,-4,-5};
		  int[]ans= alternateNumbers(A);
		  
		  for (int i = 0; i <ans.length; i++) {
		    System.out.print(ans[i]+" ");
		  }
	}

}
