package StringHard;
import java.util.*;
/*
 Approach o(N^2)
	static int KSubstringWithDiffCharacter(String s, int k)
    {

        int n = s.length(),c=0;
 
        for (int i = 0; i <= (n-k); i++) {
        	
        	// to store new string every time or we can user clear() method as well
            HashSet<Character> distinct = new HashSet<Character>();
            for (int j = i; j<n; j++) {
                    distinct.add(s.charAt(j));
                
                if (distinct.size() == k) {
                	 // below line to count longest substring with K character
                    //   answer = Math.max(answer, j - i);
                    c++;
               
                }
            }
        }
 
        return c;
    }
 */
public class KSubstringWithDiffCharacter {

	static int most_k_chars(String s, int k)
    {
   
		HashMap<Character, Integer> map = new HashMap<>();
	    int num = 0, i = 0,j=0;
	 
	    while(j< s.length()) {

	      map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
	      
	      while (map.size() > k) {

	        map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)- 1);
	        
	        if (map.get(s.charAt(i)) == 0) {
	          map.remove(s.charAt(i));
	        }
	        i++;
	      }
	      num += j - i + 1;
	      j++;
	    }
	    return num;
  }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// most_k_chars means till K or less K can also be worked
		 String str = "aacfssa";
		 int k =3;
		int ans = most_k_chars(str, k) - most_k_chars(str, k - 1);
		 System.out.println(ans);
	}

}
