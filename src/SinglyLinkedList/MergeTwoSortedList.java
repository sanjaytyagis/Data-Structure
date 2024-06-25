package SinglyLinkedList;
import java.util.*;
/*
 0(n+M) TC and Space 0(1)
 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)
        return list2;

        if(list2 == null)
        return list1;

    ListNode mergeList = null, tempList2 = null; 
    
// swapping list so that list1 always be small
    if(list1.val > list2.val) {
          mergeList = list1;
          list1 = list2;
          list2 = mergeList;
    }
    // assigned list1 to resultant list to return at the end
    mergeList = list1;
        ListNode prevList1 = null;

        while(list1!=null && list2!=null){
            
            while((list1!=null) && (list1.val <= list2.val)){
                prevList1 = list1;
                list1 = list1.next;
            }
            if((list1!=null) && (list1.val > list2.val)){
                tempList2 = list2;
                list2 = list2.next;

                tempList2.next = list1;
                prevList1.next = tempList2;
// making prev element in list 1
                prevList1 = tempList2;
            }
        }
     //edges cases
        if(list1==null)
        prevList1.next = list2;
        
	//edges cases
        if(list2==null)
        prevList1.next = list1;

        return mergeList;
    }
 */
public class MergeTwoSortedList {

	Node sortedMerge(Node headA, Node headB)
    {
        /* a dummy first node to hang the result on */
        Node dummyNode = new Node(0);
        
        /* tail points to the last result node */
        Node tail = dummyNode;
        
        while (true) {
            /* if either list runs out,use the other list */
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
            
           /* Compare the data of the two lists whichever lists' data is smaller, append it into tail and advance the head to the next Node  */
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }
 
            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }
	
	public static void main(String[] args) {
		
	}

}
