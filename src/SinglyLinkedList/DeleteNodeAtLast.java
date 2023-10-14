package SinglyLinkedList;

public class DeleteNodeAtLast {

	// Delete Node at the Last
	public static Node deleteLast(Node list){
        
        Node deleteNode = null;
        Node head = list;
        
        // check only one node is there
        if(list.next == null)
            return head;
        
        while(list.next.next != null) {
			
			list = list.next;
		}
        list.next = null;
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {1,2,3,4,5};
		Node ListCreated = CreateLinkedListFromArray.constructLL(input);
		
		Node NodeDeleted = DeleteNodeAtLast.deleteLast(ListCreated);

		while(NodeDeleted != null) {
			System.out.print(NodeDeleted.data+"-->");
			NodeDeleted = NodeDeleted.next;
		}
		
	}

}
