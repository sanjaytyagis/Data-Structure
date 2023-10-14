package Stack;

// Logic is similar to reverse a LinkedList
public class ImplementStackUsingLinkedList {

	private class Node {
	    int data;
	    Node next;
	    Node(int d) {
	      data = d;
	      next = null;
	    }
	  }
	  Node top;
	  int size;
	  
	  ImplementStackUsingLinkedList() {
	    this.top = null;
	    this.size = 0;
	  }
	  
	  //Push Element To Stack
	  public void stackPush(int x) {
	    Node element = new Node(x);
	    element.next = top;
	    top = element;
	    System.out.println("Element pushed");
	    size++;
	  }
	  //Pop Element From Stack
	  public int stackPop() {
	    if (top == null) return -1;
	    int topData = top.data;
	    Node temp = top;
	    top = top.next;
	    return topData;
	  }
	  //Get Stack Size
	  public int stackSize() {
	    return size;
	  }
	  //check stack is empty
	  public boolean stackIsEmpty() {
	    return top == null;
	  }
	  
	  public void printStack() {
	    Node current = top;
	    while (current != null) {
	      System.out.print(current.data + " ");
	      current = current.next;
	    }
	    System.out.println();
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
