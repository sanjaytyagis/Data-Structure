package RandomPracticeLogic;

import java.util.*;

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalH = Math.ceil((double)(6) / (double)(2));
		
		System.out.println(Math.round(2.5));
		
		int cnt = 0;
		int[] a = {5, 4, 3, 2, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                	cnt++;
                //System.out.println(a[i]+"  "+a[j]);
                }
            }
        }
        
		List<Integer> ob = new ArrayList();
		ob.add(3);ob.add(2);ob.add(1);
		//ob.sort(null);
			System.out.println(ob.toString());
			
		String str = "GeeksForGeeks";
		str = str.toLowerCase();
		char[] array = str.toCharArray();

		TreeMap<Character,Integer> freqCount = new TreeMap<Character,Integer>();

		for (char key : array) {
			freqCount.put(key, freqCount.getOrDefault(key, 0)+1); // count Frequency
		}

		//System.out.println(freqCount.keySet() + " " + freqCount.values());
	}

}

/* */