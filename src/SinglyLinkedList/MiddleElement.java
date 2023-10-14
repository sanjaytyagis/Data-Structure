package SinglyLinkedList;

public class MiddleElement {

	public static Node middleNode(Node head) {
		
        Node slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3,3,2,1};
		Node list = CreateLinkedListFromArray.constructLL(input);
		
		Node result = MiddleElement.middleNode(list);
		
		while(result != null) {
			System.out.print(result.data + "-->");
			result = result.next;
		}
	}

}
