package StringHard;
import java.util.*;
/*Approach1 Using Sorting
 Sort List in Decreasing Order Collections.reverse(); orSort in ascending order and then reverse the array
 
 // Approach2 Using priority Queue
  
  Map<Character, Integer> map = new HashMap();        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }      
        
        PriorityQueue <Character> pq = new PriorityQueue((a,b) -> map.get(b) - map.get(a));
        for (char c : map.keySet()) {
            pq.offer(c);
        }
        
        StringBuilder sb = new StringBuilder();       
        while (!pq.isEmpty()) {
            char c = pq.poll();
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }       
        return sb.toString();
 */

class Pair{
	
	char ch;
	int freq;
	
	public Pair(char ch, int freq) {
		this.ch = ch;
		this.freq = freq;
	}
	
}
public class SortCharactersByFrequency {

	public static String frequencySort(String s) {

		 ArrayList<Pair> arr=new ArrayList<>();

		        int ump[]=new int[123];

		        for(int i=0;i<s.length();i++){
		            char ch=s.charAt(i);
		            ump[ch]++;
		        }

		// ascii range of upper case character -> 65 to 90
		//  ascii range of lower case character->97 to 122
		//  ascii range of  0 to 9 character -> 48 to 57

		// we  are starting lopp  48 becz string contains character from between 0 to 9  
		        for(int i=48;i<=122;i++){
		            if(ump[i]>0){
		                     arr.add(new Pair((char)i,ump[i]));

		            }
		           
		        }

		        // Sorting based on Frequency based on frequency
		        Collections.sort(arr,new Comparator<Pair>(){
		        	
		            public int compare(Pair obj1,Pair obj2){

		  // It subtract the values and check if values greater than 0 or equal and less than 0 and take the action accordingly
		            	//return obj2.freq - obj1.freq; // Descending Order
		            	
		            	if (obj1.freq== obj2.freq)
		                    return 0;
		                else if (obj1.freq < obj2.freq)
		                    return 1;
		                else
		                    return -1;
		            }
		        });

		StringBuilder sb=new StringBuilder();
		
		        for(Pair pr:arr){
		            if(pr.freq==1){
		                sb.append(pr.ch);
		            }else{
		                for(int i=1;i<=pr.freq;i++){
		                    sb.append(pr.ch);
		                }
		            }

		            
		        }

		        return sb.toString();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = frequencySort("tree");
        System.out.println(result);
	}

}
