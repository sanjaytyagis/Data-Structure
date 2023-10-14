package SinglyLinkedList;

/*  Also Node of even and odd has to be arranged not the values of odd and even
 	And order of the elements should be follows as there originally 
 	
 	Approach1 :-make two list and add odd and even and then join accordingly
 	
 	Approach2 :- Divide the one linkedList with Odd and Even Nodes and at the end where node next would be null attach it to the even list
 */

// Problem to make odd node followed even node
public class EvenFollowedOddFollowed {

public static Node oddEvenList(Node head) {
        
	 if (head == null)
	      return head;

	    Node odd = head;
	    Node even = head.next;

	    // Maintain the even head
	    Node evenHead = even;

	    while (even != null && even.next != null) {

	      // Change pointers for odd list
	      odd.next = odd.next.next;
	      odd = odd.next;

	      // Change pointers for even list
	      even.next = even.next.next;
	      even = even.next;
	    }

	    // Assign even list at the end of odd list
	    odd.next = evenHead;

	    return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,1,3,5,6,4,7};
		Node list = CreateLinkedListFromArray.constructLL(input);
		
		Node result = EvenFollowedOddFollowed.oddEvenList(list);
		
		while(result != null) {
			System.out.print(result.data + "-->");
			result = result.next;
		}
	}
}


