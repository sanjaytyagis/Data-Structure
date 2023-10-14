package Stack;
import java.util.*;

// Find Minimum in O(1)
/*
  Approach-1 one Take Pair and store element with minimum value at every push of stack
  Approach-2  
 */
class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class StackMinimumElement {
	Stack < Pair > st = new Stack < > ();
    
	public void push(int x) {
        int min;
        if (st.isEmpty()) {
            min = x;
        } else {
            min = Math.min(st.peek().y, x);
        }
        st.push(new Pair(x, min)); // In Every Push enter the element as well as the minimum element at every stage
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().x;
    }

    public int getMin() {
        return st.peek().y;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
