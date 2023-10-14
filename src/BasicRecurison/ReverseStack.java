package BasicRecurison;
import java.util.*;

public class ReverseStack {
	
	public static void addAtBottom(Stack<Integer> stack, int val){

        if(stack.isEmpty()){
            stack.push(val);
            return;
        }

        int top = stack.pop();
        addAtBottom(stack, val); // keep calling until stack is empty to insert the element for which it was called
        stack.push(top); // Push the POp elements from stack
    }
	
	public static void reverseStack(Stack<Integer> stack) {
		
        if(stack.isEmpty()) 
		return ;
        int top = stack.pop();
        reverseStack(stack);
        addAtBottom(stack, top);
	}
	
	public static void main(String[] args) {
		 Stack<Integer> input = new Stack<Integer>();
        input.add(1); input.add(2); input.add(3); input.add(4); input.add(5); input.add(6);
     
        reverseStack(input);
     
        while (!input.empty())
        {
            System.out.print(input.pop()+" ");
        } 
	}
}
