package StringEasy;

// Optimal Approach with o(1) Space, We Reverse every word in String then we reverse whole string.

public class ReverseWordInString {
	
	static private String result(String s)
	{
		int left = 0;
		int right = s.length() - 1;

		String temp = "";
		String ans = "";

		//Iterate the string and keep on adding to form a word
		//If empty space is encountered then add the current word to the result
		while (left <= right)
		{
			char ch = s.charAt(left);
			if (ch != ' ')
			{
				temp += ch;
			}
			else if (ch == ' ')
			{
				if (!ans.equals(""))
				{
					ans = temp + " " + ans;
				}
				else
				{
					ans = temp;
				}
				temp = "";
			}
			left++;
		}
		
		System.out.println(ans);
		
		//If not empty string then add to the result(Last word is added)
		if (!temp.equals(""))
		{
			if (!ans.equals(""))
			{
				ans = temp + " " + ans;
			}
			else
			{
				ans = temp;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		String st = "TUF is great for interview preparation";
		System.out.println("Before reversing words: ");
	    System.out.println(st);
	    System.out.println("After reversing words: ");
		System.out.print(result(st));

	}

}
