package RecursionSubsequence;
import java.util.*;

public class PhoneNumbberLetterCombination {

	public static void buildMap(HashMap<Character,String> hmap)
    {
        hmap.put('2',"abc"); hmap.put('3',"def"); hmap.put('4',"ghi"); hmap.put('5',"jkl");
        hmap.put('6',"mno");  hmap.put('7',"pqrs"); hmap.put('8',"tuv"); hmap.put('9',"wxyz");
    }
	
public static void backtrack(int len, String digits, HashMap<Character,String> hmap, String temp, List<String> result,int idx)
    {
        if(temp.length() == len)
        {
            result.add(new String(temp));
            return;
        }
        for(int i = 0;i<hmap.get(digits.charAt(idx)).length();i++)
        {
            temp = temp+hmap.get(digits.charAt(idx)).charAt(i);
            backtrack(len,digits,hmap,temp,result,idx+1);
            temp = temp.substring(0,temp.length()-1);
        }
    }
	
	public static void main(String[] args) {
		List<String> result = new ArrayList();
        HashMap<Character,String> hmap = new HashMap<>();
        buildMap(hmap);
        
        String digits = "23";
        
        if(digits.length() == 0)
            System.out.println(result.toString());
        
        backtrack(digits.length(),digits,hmap,"",result,0);
        System.out.println(result.toString());

	}

}
