package ArraysMedium;

// Optimal Moore's Voting Algo :- Used to find the element that has occurrence more than N/2 

public class ElementGreaterHalfTimes {

	public static int majorityElement(int []v) {
        int count=0, element = 0;
        for(int currentElement : v){
            if(count ==0)
                element = currentElement;
            
            if(currentElement == element)
                count++;
            else
                count--;
        }
        return element;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {2,2,0,0,1};
		
		int n = input.length;
		//int result = Sort012.sortArray(input,n);
		//System.out.println(result);
		
	}

}
