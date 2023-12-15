package HeapSort;
import java.util.*;
// compare l1 and l2 and resultant with another 0(N*k)
/* Heap T.C = 0(N*logK) n number of k list would be
   in heap store list pointers in array and every time make the heap of k element of list by adding their first elements 
   bcoz list is sorted and then increase the pointer of the list that element is pop out from
 */
// Divide ad conquer 0(N*logk)
 class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class MergeMSortedList {
	
	public static ListNode partion(ListNode[] lists,int s,int e){
	    if(s==e) 
	    	return lists[s];
	    if(s<e)
	    {
	        int q=(s+e)/2;
	        ListNode l1=partion(lists,s,q);
	        ListNode l2=partion(lists,q+1,e);
	        return merge(l1,l2);
	    }
	    else
	        return null;
	}
	
	public static ListNode merge(ListNode l1,ListNode l2){
		
	    if(l1==null) return l2;
	    if(l2==null) return l1;
	    
	    if(l1.val<l2.val)
	    {
	        l1.next=merge(l1.next,l2);
	        return l1;
	    }
	    else{
	        l2.next=merge(l1,l2.next);
	        return l2;
	    }
	}
	
	public static ListNode mergeKLists(ListNode[] lists){
	    return partion(lists,0,lists.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lists = Arrays.asList(1,2,3);
		//ListNode obj = MergeMSortedList.mergeKLists();
	}

}
