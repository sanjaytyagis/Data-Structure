package BasicRecurison;
import java.util.*;

//My Logic Failing for String "A man, a plan, a canal: Panama", doens't cover lowercase and space and extra character

		/*if(i>j)
 	return true;
 
     if(str.charAt(i) != str.charAt(j))
     	return false ;
     
     	i++;j--;
     return isPalindrome(str,i,j);*/

public class Pallindrome {

public static boolean isPalindrome(String s, int i,int j) {
	
	if (s.isEmpty()) 
        return true;
	
	if(i>j)
    	return true;
	
	//using while because back to back space extra character can come eg ", :,"
    while(i<s.length() && !Character.isLetterOrDigit(s.charAt(i))) 
        i++; 
    
  //using while because back to back space extra character can come eg ", :,"
    while(j>=0 && !Character.isLetterOrDigit(s.charAt(j))) 
        j--;
    
  //using while because back to back space extra character can come eg ", :,"
    if (i<s.length() && j>=0 && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) 
            return false;
        
        i++;
        j--;
    return isPalindrome(s,i,j);
        
    }
	public static void main(String[] args) {
		// Code failing for below Test Cases
		// "A man, a plan, a canal: Panama"
		String str = "A man, a plan, a canal: Panama";
	
		boolean result = Pallindrome.isPalindrome(str,0,str.length()-1);
		
		System.out.println(result);
	}

}
