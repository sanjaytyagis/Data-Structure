package StringEasy;

//Hint Don't store count of characters in This, only check the Mapping
/*
 Two strings are isomorphic if one-to-one mapping is possible for every character of the first string to every character of the second string.
For example, consider the two strings: “ACAB” and “XCXY”. We can map the characters of the first string to the characters of the second string as follows:

‘A’ maps to ‘X’.
‘C’ maps to ‘C’.
‘B’ maps to ‘Y’.

static boolean areIsomorphic(String str1, String str2)
    {
 
        HashMap<Character, Character> charCount = new HashMap();
        char c = 'a';
        
        for (int i = 0; i < str1.length(); i++) {
        
        // Key Exist Krti Hai to Match kro ki Value bhi match krre str2 kai index element sai
            if (charCount.containsKey(str1.charAt(i))) {
                c = charCount.get(str1.charAt(i));
                
                if (c != str2.charAt(i))
                    return false;
            }
          // Agr Key Exist nhi krte hai to check kro ki uski Value Map mai khi exist to nhi krti hai
           
            else if (!charCount.containsValue(str2.charAt(i))) {
                charCount.put(str1.charAt(i),str2.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }
 */
public class IsomorphicString {

	public static boolean isIsomorphic(String s, String t) {
		
       int map1[]=new int[200];
       int map2[]=new int[200];

       if(s.length()!=t.length())
           return false;


       for(int i=0;i<s.length();i++)
       {
    	   //System.out.println(map1[s.charAt(i)]);
    	   // Compare the maps, if not equal, return false...
           if(map1[s.charAt(i)]!=map2[t.charAt(i)])
               return false;

        // Insert each character if string s and t into seperate map...
           map1[s.charAt(i)]=i+1;
           map2[t.charAt(i)]=i+1;
       }
       return true;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       String s = "ACAB", t = "XCXY";
       System.out.println(IsomorphicString.isIsomorphic(s,t));
       
	}

}
