package StringEasy;

/*
  		If Left Rotation of string is required x moves then Right Rotation will be (n-x) moves where n is length of string
  		
  		Approach 1, 2:- T.c = O(n2) SC = O(n) 
  		public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
 */
public class RotationString {

	
public static boolean rotateString(String s, String goal) {
        
        boolean result = false;

        if(s.length() != goal.length())
            return result;

        int n = s.length();

        for(int i =0; i<n; i++){
        	
        	// In every rotation we need to pick starting element and then attach first with temaining and then compare with goal string
            String last = s.substring(0,i+1);
            String first = s.substring(i+1,n);
            String  comp = first.concat(last);
            if(comp.equals(goal)){
                result = true;
                break;
            }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String goal = "cdeab";
		
		boolean result = rotateString(s,goal);
        System.out.println(result);
	}

}
