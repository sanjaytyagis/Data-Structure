package DoublyLinkedList;

public class InsertNodeAtLast {

	public static Node insertAtTail(Node list, int K) {
        // Write your code here
        Node node = new Node(K);
        Node head = list;

        if(head == null)
         return node;

        while(head.next != null) {
			head = head.next;
		}
         node.prev = head;
         head.next = node;
         return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
