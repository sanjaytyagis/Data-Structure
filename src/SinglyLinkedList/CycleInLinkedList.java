package SinglyLinkedList;
import java.util.*;
/*
Approach1 Using HashSet and keep the Node addresses and check If node exists
Approach2 Floyd's detection Algorithm when slow and fast pointers are meet it means cycle
*/
public class CycleInLinkedList {

	// Approach1 but taking extra space o(n) because storing node data
	public static boolean cycleDetectUsingHash(Node head) {
		
	    HashSet <Node> hashTable=new HashSet<>();
	    
	    while(head != null) {
	        if(hashTable.contains(head)) return true;
	        hashTable.add(head);
	        head = head.next;
	    }
	    return false;
	}
	
	// Approah 2
	public static boolean cycleDetectUsingTwoPointers(Node head) {
		
	    if(head == null) 
	    return false;
	    
	    Node slow = head;
	    Node fast = head;
	      
	    while(fast.next != null && fast.next.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	        if(fast == slow) 
	        return true;
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node ob = new Node(1);
		ob.next = ob;
		System.out.println(CycleInLinkedList.cycleDetectUsingTwoPointers(ob));
	}

}
