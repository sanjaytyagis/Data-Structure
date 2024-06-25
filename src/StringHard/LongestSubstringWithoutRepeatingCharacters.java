package StringHard;
import java.util.*;
/*
  Approach 1 -> generate all substring and then check 
  
  public int lengthOfLongestSubstring(String s) {
        String str = s;
        if(str.length()==0)
             return 0;
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) // outer loop for traversing the string
        {
            Set <Character> se = new HashSet < > ();
            for (int j = i; j < str.length(); j++) // nested loop for getting different 
            {
                if (se.contains(str.charAt(j))) // if element if found so mark it as ans 
                {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(str.charAt(j));
                maxans = Math.max(maxans, se.size());
            }
        }
        return maxans;
    }
 */
public class LongestSubstringWithoutRepeatingCharacters {
	static int solve(String str) {

        if(str.length()==0)
             return 0;
        int maxans = Integer.MIN_VALUE;
        Set < Character > set = new HashSet < > ();
        int l = 0;
        for (int r = 0; r < str.length(); r++) // outer loop for traversing the string
        {
            if (set.contains(str.charAt(r))) //if duplicate element is found
            {
                while (l < r && set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
    }
	public static void main(String[] args) {
	}

}
