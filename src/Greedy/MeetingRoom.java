package Greedy;
import java.util.*;

public class MeetingRoom {
	public static class Solution1 {
		
        public int minMeetingRooms(int[][] intervals) {
            if (intervals == null || intervals.length == 0) {
                return 0;
            }
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);// Sort the intervals by start time
         // Use a min heap to track the minimum end time of merged intervals
            PriorityQueue<int[]> heap = new PriorityQueue<>(intervals.length, (a, b) -> a[1] - b[1]);
            heap.offer(intervals[0]);// start with the first meeting, put it to a meeting room
            
            for (int i = 1; i < intervals.length; i++) {
                // get the meeting room that finishes earliest
                int[] last = heap.poll(); // we can use peek also
                if (intervals[i][0] >= last[1]) {
                    // if the current meeting starts right after
                    // there's no need for a new room, merge the interval
                    last[1] = intervals[i][1];
                } else {
                    // otherwise, this meeting needs a new room
                    heap.offer(intervals[i]);
                }
                // don't forget to put the meeting room back
                heap.offer(last);
            }

            return heap.size();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
