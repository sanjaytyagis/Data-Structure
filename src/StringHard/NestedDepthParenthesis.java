package StringHard;

/* using stack: 
    TC: O(n)
    Sc: O(n)
    
public int maxDepth(String s) {
    Stack st =new Stack();
    int n = s.length();
    int max = 0;
    
    for(int ptr=0;ptr<n;ptr++){
        char curr = s.charAt(ptr);
        if(curr == '('){
            st.add(curr);
        }else if(curr == ')'){
            if(st.isEmpty()){
                return -1;
            }
            st.pop();
        }
        max = Math.max(st.size(),max);
    }
    return max;
} */

public class NestedDepthParenthesis {

	public static int maxDepth(String s) {
        int open = 0;
        int n = s.length();
        int max = 0;
        
        for(int ptr=0;ptr<n;ptr++){
            char curr = s.charAt(ptr);
            if(curr == '('){
                open++;
            }else if(curr == ')'){
                if(open == 0){
                    return -1;
                }
                open--;
            }
            max = Math.max(open,max);
        }
         return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"(1+(2*3)+((8)/4))+1"
		int result = maxDepth("(1)+((2))+(((3)))");
        System.out.println(result);
	}

}
