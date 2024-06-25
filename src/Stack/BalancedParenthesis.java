package Stack;
import  java.util.*;
/*
 * Logic: If push and pop nothing is happening on coming character then parenthesis not balanced
 
  public boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') 
                stack.push(c); 
            else if ((!stack.isEmpty()) && (stack.peek() == '(' && c==')' || 
            stack.peek() == '{' && c=='}' || stack.peek() == '[' && c==']'))
                stack.pop();
            else 
                return false;
        }
        return stack.isEmpty();
        }
 */
public class BalancedParenthesis {
	
	public static boolean isValid(String s) {

        Stack<Character> stack = new Stack();
// else if important bcoz if if executed then no else will be executed
        for(char c : s.toCharArray()){
            if (c == '(') 
                stack.push(')'); 
            else if (c == '{') 
                stack.push('}');
            else if (c == '[') 
                stack.push(']'); 
            else if (stack.isEmpty() || stack.pop() != c) 
                return false;
        }
        return stack.isEmpty();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()";
		boolean result = isValid(s);
        System.out.println(result);
	}

}
