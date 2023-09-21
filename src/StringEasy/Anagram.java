package StringEasy;
import java.util.*;

public class Anagram {

	public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }
        
        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String goal = "gramana";
		
		boolean result = isAnagram(s,goal);
        System.out.println(result);
	}

}
