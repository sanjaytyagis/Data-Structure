package SinglyLinkedList;

/*
  Approach 
  --> Move Fast pointer one by one till nth Steps
  --> move start and fast pointer until fast reaches to null
  --> then nth node will be near to the start pointer's node
 */
public class DeleteLastNthNode {

	public static Node removeNthFromEnd(Node head, int n) {
        Node fast = head, slow = head;

        for (int i = 0; i < n; i++) 
        fast = fast.next;
        
        if (fast == null) 
        return head.next;
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3,4,5,6};
		Node list = CreateLinkedListFromArray.constructLL(input);
		
		Node result = DeleteLastNthNode.removeNthFromEnd(list,2);
		
		while(result != null) {
			System.out.print(result.data + "-->");
			result = result.next;
		}
	}

}
