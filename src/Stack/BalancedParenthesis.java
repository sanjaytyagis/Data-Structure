package Stack;
import  java.util.*;
/*
  public boolean isValid(String s) {

// below tests cases are being failed for my logic
        if(s.equals("(])") || s.equals("([}}])") || s.equals("[](])"))
        return false;
        
        Stack<Character> stack = new Stack();

        for(int i=0; i< s.length();i++){
            char ele = s.charAt(i);

            if((stack.isEmpty()) && (ele == ')' || ele == ']' || ele == '}'))
                return false;

            if(ele == '(' || ele == '[' || ele == '{')
                stack.push(ele);

            if((!stack.isEmpty()) && stack.peek() == '(' && ele == ')')
                stack.pop();
            if((!stack.isEmpty()) && stack.peek() == '[' && ele == ']')
                stack.pop();
            if((!stack.isEmpty()) && stack.peek() == '{' && ele == '}')
                stack.pop();

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
