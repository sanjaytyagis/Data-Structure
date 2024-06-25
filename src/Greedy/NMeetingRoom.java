package Greedy;
import java.util.*;

class meeting {
    int start;
    int end;
    int pos;
     
    meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting o1, meeting o2) 
    {
        return o1.end - o2.end;
    }
}

public class NMeetingRoom {

	static void maxMeetings(int start[], int end[], int n) {
		
        ArrayList<meeting> meet = new ArrayList<>();
        
        // adding meeting, start, end in array list to sort data on behalf of endDate
        for(int i = 0; i < start.length; i++)
            meet.add(new meeting(start[i], end[i], i+1));
        
        Collections.sort(meet, new meetingComparator()); 
        
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        
        int limit = meet.get(0).end; 
        
        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end; 
                answer.add(meet.get(i).pos);
            }
        }
        
        System.out.println("The order in which the meetings will be performed is ");
        
        for(int i = 0;i<answer.size(); i++) 
            System.out.print(answer.get(i) + " ");

    }
	
	public static void main(String[] args) {
		int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        maxMeetings(start,end,n);
	}
}
