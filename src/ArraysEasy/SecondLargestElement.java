package ArraysEasy;

// wants to check the logic then check for only 1 and 2 elements
public class SecondLargestElement {
	
	public static int getSecondLargestElement(int []input) {
        // Write your code here.
        int index, max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int arraySize = input.length;
        
        for(index=0; index<arraySize ; index++){
        	
            int element = input[index];

            if(element > max){
                secondMax = max;
                max = element;
            }

            if(element > secondMax && element != max){
                secondMax = element;
            }
        }

       
        return secondMax;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,4,2,5,3};
		int result = SecondLargestElement.getSecondLargestElement(input);
		System.out.println(result);
	}

}
