package DoublyLinkedList;

class Node {
    public int data;
    public Node next;
    public Node prev;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CreateLinkedListFromArray {

	public static Node constructDLL(int []arr) {
        // Write your code here

        Node head = null,temp = null;
        
        // Create LinkedList From Array
        for(int element : arr){
            Node node = new Node(element);
            
            if(head == null){
             head = node;
             temp = head;
            }
             else
             {
               temp.next = node;
               node.prev = temp;
               temp = node; 
             }
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {1,2,3,4,5};
		Node result = CreateLinkedListFromArray.constructDLL(input);
		
		// Print LinkedList after Returning
		while(result != null) {
			System.out.print(result.data + "<-->");
			result = result.next;
		}
	}

}
