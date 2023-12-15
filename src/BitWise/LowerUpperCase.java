package BitWise;

/*
  --> Lower to Upper Case
  
   		In Lower case 32 gets added in Upper case,
   		So If we clear the set bit in number 32 then number will be converted into Upper case)
  
  		char ch = 'z';
		int k = ch;
		k = k & (~(1<<5));
		System.out.println((char)k);
		
		--> Upper to Lower Case
		
		char ch = 'z';
		int b = ch | 32;
		System.out.println((char)b);
		
 */

/* Question --> Convert String Letters upper to lower, Lower to Upper 
   Answer -> When taking characters check the bit of number at 6th Place 0/1 due to 32 addition and take action accordingly
 */
public class LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
