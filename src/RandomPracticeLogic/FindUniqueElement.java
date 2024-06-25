package RandomPracticeLogic;

// Find the unique element in the array, but there would be only one unique element in the entire array
// Optmized approach is make the XOR of the elements in the array, because XOR of same numbers is 0 and 
//If you would XOR of any number with 0 then It will give same number

/* Unique Numer of occurence // we can use HashMap and HashSet then check size of hashmap and set 
 * other sol sort the frequency and match If  adjacent frequency are equal or unequal
 https://leetcode.com/problems/unique-number-of-occurrences/editorial/
 */
public class FindUniqueElement {

	public static void main(String[] args) {
		
		int a =5, b=7, c = 5; // Example Of XOR
		System.out.println(a^b^c);
		
		int arr[] = {1,2,2,1,1,3};
		int out = 0;
		
		for(int i=0; i< arr.length;i++) {
			out= arr[i]^out;
			System.out.println(out);
		}
		System.out.println("Final Result "+out);
		
		// Ascii Value Print Logic
		char var = '0';
		int ans = var;
		System.out.println(ans);
		
		
	}
}
