package RecursionSubsequence;
import java.util.ArrayList;
import java.util.List;

/*
  public static List<String> generateBinaryString(int index, int n, String str, List<String> seq)
	{	
		if (index == n)
		{
			seq.add(str);
			return seq;
		}
			
		generateBinaryString(index + 1, n, str+"0", seq); 
						
		generateBinaryString(index + 1, n, str+"1", seq); 	
			return seq;
	}
 */

public class Practice {
	
	// generate Binary String Without Consecutive Ones
	public static List<String> generateBinaryString(int index, int n, String str, List<String> seq)
	{	
		if (index == n)
		{
			seq.add(str);
			return seq;
		}
			
		if (str.length() > 0 && str.charAt(str.length() - 1) == '1')
		{
			generateBinaryString(index + 1, n, str+"0", seq); 
		}
		else {
			generateBinaryString(index + 1, n, str+"0", seq); 
			generateBinaryString(index + 1, n, str+"1", seq); 
		}
		
		return seq;
	}
	
	public static void main(String[] args) {
		
		List<String> seq = new ArrayList<>();
		int n = 3;
		
		generateBinaryString(0, n, "", seq);
	    System.out.println(seq); // To Print Final Sequence
	    
	}
}
