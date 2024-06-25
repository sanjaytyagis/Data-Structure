package Greedy;
import java.util.*;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {

		// Sorting Happening based on the first element of intervals
        Integer[][] arr = new Integer[intervals.length][2];

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = intervals[i][j];
            }
        }
       int n = arr.length; // size of the array
        
        Arrays.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[] a, Integer[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        // Main Logic for merge Interval
        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1,
                                            Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        
        // In Leetcode we have to return array so converted list to array
        int[][] res = new int[ans.size()][2]; 
        int k = 0;
        for(List<Integer> li : ans){
                res[k][0] = li.get(0);
                res[k][1] = li.get(1);
                k++;
        }

        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
