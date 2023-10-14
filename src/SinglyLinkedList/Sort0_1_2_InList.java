package SinglyLinkedList;

// No New List create three nodes and adjust the node pinters of main list into the given nodes.
public class Sort0_1_2_InList {

	public static Node sortList(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        
        Node zeroD = new Node(0); 
        Node oneD = new Node(0); 
        Node twoD = new Node(0); 
  
       
        Node zero = zeroD, one = oneD, two = twoD; 
        // Traverse list 
        Node curr = head; 
        while (curr!=null) 
        { 
            if (curr.data == 0) 
            { 
                zero.next = curr; 
                zero = zero.next; 
                curr = curr.next; 
            }
            else if (curr.data == 1) 
            { 
                one.next = curr; 
                one = one.next; 
                curr = curr.next; 
            } 
            else 
            { 
                two.next = curr; 
                two = two.next; 
                curr = curr.next; 
            } 
        }
        // Attach three lists 
        zero.next = (oneD.next!=null) ? (oneD.next) : (twoD.next); 
        one.next = twoD.next; 
        two.next = null;
        // Updated head 
        head = zeroD.next;
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,2,1,1,0,0};
		Node list = CreateLinkedListFromArray.constructLL(input);
		
		Node result = Sort0_1_2_InList.sortList(list);
		
		while(result != null) {
			System.out.print(result.data + "-->");
			result = result.next;
		}
	}

}
