package StringEasy;

// Approach 1 Sort the String Lexiographically(Dictionary) and then get the common prefix from 1st element and last element

// Approach 2 Finding the longest common prefix (Horizontal scanning)

// Approach 2: Vertical scanning

/*
 public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);             
        }
    }
    return strs[0];
}
 */
public class LongestCommoPrefix {

	 public static String longestCommonPrefix(String[] arr)
	    {
	       int n = arr.length;
	       // take temp_prefix string and assign first element of arr : a.
	       String result = arr[0];
	       
	       // Iterate for rest of element in string.
	       for(int i = 1; i < n; i++){
	    	   
	            /* .indexOf() return index of that substring from string.
	    	    As String Prefix can be in lexicographically not from in between we can get the Substring 
	    	   that first match will always be at 0th index */
	    	   
	            while(arr[i].indexOf(result) != 0){
	               
	                // update matched substring prefix
	                result = result.substring(0, result.length()-1);
	               
	                // check for empty case. direct return if true..
	                if(result.isEmpty()){
	                    return "";
	                }
	            }
	        }
	        return result;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        String[] input = {"flower", "tflow", "flight"};
        System.out.println( "The longest Common Prefix is : " +
        		LongestCommoPrefix.longestCommonPrefix(input));
	}

}
