package Stack;
import java.util.*;
/*
  Approach 1 Using 2 Queue (Increase the complexity of Push Operation)
  -> Add element to Q2
  -> Transfer all element from Q1 to Q2
  -> Swap element of Q1 and Q2(Q1 <-> Q2)
  -> Pop element of Q1 now stack is ready
  
  Approach 2 Using Single Queue
  Use a single queue and reorganize (rotate) its elements when pushing a new element,
   means whenever you are pushing new element then remove the element from queue and 
   insert it again due to this bottom element will come on top
 */
public class ImplementStackUsingQueue {

	private Queue<Integer> q;
    public ImplementStackUsingQueue() {
         q = new LinkedList<>();
    }
    
    public void push(int x) {
         q.add(x);				/* 1 used here because loop should run 1 less the no of element 
									because 4th element is the latest inserted element */
        for (int i = 1; i < q.size(); i++) { 
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
    
    int size() {
        return q.size();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStackUsingQueue s = new ImplementStackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());

	}

}
