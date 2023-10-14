package SinglyLinkedList;

import ArraysEasy.ArrayIsSorted;

class Node {
	
    public int data;
    public Node next;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

public class CreateLinkedListFromArray {

	public static Node constructLL(int []arr) {
		
        Node head = null,temp = null;
        
        // Create LinkedList From Array
        for(int element : arr){
            Node node = new Node(element);
            
            if(head == null){
             head = node;
             temp = head;
            }
             else{
               temp.next = node; 
               temp = temp.next;
             }
        }
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3,4,5};
		Node result = CreateLinkedListFromArray.constructLL(input);
		
		// Print LinkedList after Returning
		while(result != null) {
			System.out.print(result.data + "-->");
			result = result.next;
		}
		
	}

}
