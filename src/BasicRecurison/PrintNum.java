package BasicRecurison;

import java.util.*;

public class PrintNum {
	static int n=5;
	int i=0;
	static int arr[] = new int[5];
	
	public void printNum(int n) {
        if(n==0)
        return;
        printNum(n-1); // in recursion never ever used n++ & n-- 
        arr[i] = n;
        i++;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintNum().printNum(n);
		System.out.println(Arrays.toString(arr));
	}
}
