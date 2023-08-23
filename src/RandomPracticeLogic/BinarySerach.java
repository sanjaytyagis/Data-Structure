package RandomPracticeLogic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySerach {
	
	/*public boolean checkKey(int arr[], int key) {
		int l=0, h = arr.length-1;
		boolean result = false;
		while(l<=h) {
			int mid = (l+h)/2;
			if(arr[mid] == key) {
				result = true;
				break;
			}
			else if(key < arr[mid]) {
				h = mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return result;
	}*/
	
	public static void main(String[] args) {
		/*int arr[] = {1,2,3,4,5,6,7,8,9};
		BinarySerach ob = new BinarySerach();
		System.out.println(ob.checkKey(arr,5)); */
		
		Integer nums[] = {1,0};
		List<Integer> arr = Arrays.asList(nums);
		
		int len = arr.size(),j=0,i=0;

        while(i<len){

            if(arr.get(i) == arr.get(j)){
                if(j<len && j!=len-1)
                    j++;
            }

            if(arr.get(i) < arr.get(j)){
                if(i<len && i!=len-1)
                    i++;
            }

            if(arr.get(i) > arr.get(j)){
                Collections.swap(arr, i, j);
                if(j<len && j!=len-1)
                    j++;
            }
        }
        	System.out.println(arr.toString());        	

	}

}
