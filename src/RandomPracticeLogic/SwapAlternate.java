package RandomPracticeLogic;

/* Problem
 Swap 1st element with 2nd element and then 3rd with with and so on 
 
 */
public class SwapAlternate extends Exception{
	
	public SwapAlternate(String errorMessage) {  
	    super(errorMessage);  // Super is Important, otherwise it won't take the custom message to the Exception class
	    }
	
	
	public static int[] swapAltElement(int swapAltArr[]) throws SwapAlternate {
		
		// to check array shouldn't be null
		if(swapAltArr == null) {
			throw new SwapAlternate("Null Array Has been Passed"); // throwing Null Exception
		}
		// to check array isn't empty
			if(swapAltArr.length==0)
				throw new SwapAlternate("Array is Empty"); // throwing Empty Exception
			
			int swapAltArrLen = swapAltArr.length;
			
			if(swapAltArrLen == 1) {
					return swapAltArr;
			}
				for(int row =0; row < swapAltArrLen ;row=row+2) {
					// Swapping If elements are in Odd number 
						if((swapAltArrLen%2)!=0 && (row<swapAltArrLen-1)){ // EAsy Trick row+1 < arr.length
							int temp = swapAltArr[row];
							swapAltArr[row] = swapAltArr[row+1];
							swapAltArr[row+1] = temp;
						}
					// Swapping If elements are in even number 
						if((swapAltArrLen%2)==0) { //don't use else It make array indexoutOfBoundException
							int temp = swapAltArr[row];
							swapAltArr[row] = swapAltArr[row+1];
							swapAltArr[row+1] = temp;
						}
						
					}
		return swapAltArr;
}
	
	public static void main(String[] args) throws NullPointerException {
		
		int resultArr[] = null;
		try {
		 resultArr = SwapAlternate.swapAltElement(new int[]{2,1,4,3,5}); // calling to Method
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage()); // Handle Exception
		}
		
			if(resultArr != null) { // for loop will retrieve only if array is not null and Empty
				for (int retrieve : resultArr) {
					System.out.println(retrieve);
				}
			}
	}

}
