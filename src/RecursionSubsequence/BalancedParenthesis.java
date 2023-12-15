package RecursionSubsequence;
import java.util.*;

public class BalancedParenthesis {
	
	 static List<String> ans = new ArrayList<>();
	 
	public static void backtrack(String s,int openN,int closeN,List<String>ans,int n){
		
        if(openN == n && closeN == n){
            ans.add(s);
        }
         if(openN<n){//allowed to put close
            backtrack(s+"(",openN+1,closeN,ans,n);
        }
        if(closeN<openN){
            backtrack(s+")",openN,closeN+1,ans,n);
        }
    }

	public static List<String> generateParenthesis(int n) {
       
        backtrack("",0,0,ans,n);
        return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BalancedParenthesis.generateParenthesis(3);
		 System.out.println(ans.toString());
	}

}
