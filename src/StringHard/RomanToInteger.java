package StringHard;
import java.util.*;

/*
   Logic behind This
   The key intuition lies in the fact that in Roman numerals, when a smaller value appears 
   before a larger value, it represents subtraction, while when a smaller value appears after or equal 
   to a larger value, it represents addition.
 */
public class RomanToInteger {

	public static int romanToInt(String s) {
    Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
        	
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) 
            {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }
        
        return ans;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = romanToInt("MCMXCIV");
        System.out.println(result);
	}

}
