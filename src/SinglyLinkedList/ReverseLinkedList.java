package SinglyLinkedList;

/*
   [1] Store the Next List apart from Previous Node
   [2] Assigning Previous to the Current Node to next
   [3] Update the Previous Node with Current Node
   [4]	Update Current Node with the remaining list
 */
public class ReverseLinkedList {

	public static Node reverseList(Node head) {
        Node prev = null;  
        Node current = head;
    
        while(current != null) { 
            Node next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3,4,5};
		Node list = CreateLinkedListFromArray.constructLL(input);
		
		Node result = ReverseLinkedList.reverseList(list);
		
		while(result != null) {
			System.out.print(result.data + "-->");
			result = result.next;
		}
	}

}
