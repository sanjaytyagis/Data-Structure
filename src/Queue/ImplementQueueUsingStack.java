package Queue;
import java.util.*;
/*
Approach 1 Using 2 Stack
-> Transfer all element from S1 to S2
-> Push element to S1 (x -> S1)
-> Transfer all element from S2 to S1

Approach 2 Using input and Output Stack

*/
public class ImplementQueueUsingStack {

	Stack < Integer > input;
    Stack < Integer > output;
    
    /** Initialize your data structure here. */
    public ImplementQueueUsingStack() {
    	 input = new Stack();
         output = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        System.out.println("The element pushed is " + x);
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // shift input to output 
        if (output.empty())
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
         }


        int x = output.peek();
        output.pop();
        return x;
    }

    /** Get the front element. */
    public int peek() {
        // shift input to output 
        if (output.empty())
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }
        return output.peek();
    }
    
    int size() {
        return (output.size() + input.size());
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
