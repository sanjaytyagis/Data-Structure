package BinarySerachTree;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
public class BinarySearchTreeUsingRecursion {
	
	public static void insert(Node node, int value) {
		
        if (value < node.value) { 
        	
        	if (node.left != null)
        	 insert(node.left, value); 
        	else 
        		node.left = new Node(value);
        		
        } 
        else if (value > node.value) 
        {
        	
          if (node.right != null) 
            insert(node.right, value);
          else 
            node.right = new Node(value);
          
        }
      }
	
     public static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        BinarySearchTreeUsingRecursion.insert(root, 2);
        BinarySearchTreeUsingRecursion.insert(root, 4);
        BinarySearchTreeUsingRecursion.insert(root, 8);
        BinarySearchTreeUsingRecursion.insert(root, 6);
        BinarySearchTreeUsingRecursion.insert(root, 7);
        BinarySearchTreeUsingRecursion.insert(root, 3);
        BinarySearchTreeUsingRecursion.insert(root, 9);
        System.out.println("Traversing tree in order");
        BinarySearchTreeUsingRecursion.traverseInOrder(root);
	}

}
