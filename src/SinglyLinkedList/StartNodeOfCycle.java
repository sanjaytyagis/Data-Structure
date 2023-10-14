package SinglyLinkedList;

public class StartNodeOfCycle {

	public static Node detectCycle(Node head) {
		
	    if(head == null || head.next == null)
	    	return null;
	        
	    Node fast = head;
	    Node slow = head;
	    Node entry = head;
	        
	    while(fast.next != null && fast.next.next != null) {
	    	
	        slow = slow.next;
	        fast = fast.next.next;
	            
	        if(slow == fast) {  // to Check if cycle presents or not
	        	
	            while(slow != entry) { // when they Met then find the start node where cycle exist
	                slow = slow.next; // slow cycle node prr aane mai utna hi time lega jitna entry start node sai cycle prr aane mai lega
	                entry = entry.next;
	            }
	            return slow;
	        }
	    }
	    return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
