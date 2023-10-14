package Stack;
import java.util.*;

/* Time Complexity: 0(N2)
   Space Complexity: 0(N)
 */
public class SortUsingStack {
	
public static Stack<Integer> sortstack(Stack<Integer> input){
	
	Stack<Integer> tmpStack = new Stack<Integer>();
	
	while(!input.isEmpty())
	{
		int inpEle = input.pop();
		
		// while temporary stack is not empty and top of stack is lesser than temp
		while(!tmpStack.isEmpty() && inpEle > tmpStack.peek())
		{
		// pop from temporary stack and  push it to the input stack
		input.push(tmpStack.pop());
		}
		// push temp in temporary of stack
		tmpStack.push(inpEle);
	}
		return tmpStack;
}
	 
	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
     
        // This is the temporary stack
        Stack<Integer> tmpStack=sortstack(input);
        System.out.println("Sorted numbers are:");
     
        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        } 
	}

}
