package StringHard;
import java.util.*;

public class LongestKDifferentCharacterSubString {

	static int longestKSubstr(String s, int k)
    {
		int len = s.length();
        int answer=-1,i=0,j=0;
        
        HashMap<Character,Integer> hm = new HashMap<>(); 
      
       while (j<len){
       
            char ch = s.charAt(j);

            hm.put(ch, hm.getOrDefault(ch,0)+1); 
           
           // decrease the frequency until it gets 0 and once it's zero remove from Map
            if (hm.size()>k){ 
                while(hm.size()>k){
                
                    char iChar = s.charAt(i);
                    int freqiChar = hm.get(iChar);
                    
                    hm.put(iChar, freqiChar-1);
                    
                    if (hm.get(iChar)==0)
                        hm.remove(iChar);
                    i++;
                }
            }
         // Substring size equal to K that means map size equal to K
            if(hm.size() == k){ 
                int currentAns = j-i+1;
                answer = Math.max(answer,currentAns);
            }
            j++; // increase window size and look for next window where sum = target
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "aabacbebebe";
	        int k = 3;
	 
	        // Function Call
	        System.out.println(longestKSubstr(s, k));
	}

}
