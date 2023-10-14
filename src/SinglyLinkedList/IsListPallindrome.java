package SinglyLinkedList;

/* Approach Find the mid of the List and then reverse the list ahead of mid and 
then start compare the element from start to the slow pointer one by one

Also, if examinar wants the same list then he we can again reverse that part and we ill get same list
*/

public class IsListPallindrome {

	static boolean isPalindrome(Node head) {
		
	    if(head==null||head.next==null) 
	    	return true;
	        
	    Node slow = head;
	    Node fast = head;
	        
	    while(fast.next!=null && fast.next.next!=null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	        
	    slow.next = ReverseLinkedList.reverseList(slow.next); // Most Important to put head of reverse list into slow.next
	    slow = slow.next; // update the slow pinter to the next node to compare
	    Node dummy = head;
	        
	    while(slow!=null) {
	        if(dummy.data != slow.data)
	        	return false;
	        dummy = dummy.next;
	        slow = slow.next;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3,3,2,1};
		Node list = CreateLinkedListFromArray.constructLL(input);
		
		boolean result = IsListPallindrome.isPalindrome(list);
		
		System.out.println(result);
	}

}
