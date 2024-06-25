package BinaryTree;

class Node {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
// i/2	Returns the parent node where i is left child node index
public class CreateBinaryTreeIteratively {

	// create a tree  
	public static Node insertLevelOrder(int[] arr, int i)
    {
          Node root = null;
          
        // Base case for recursion
        if (i > arr.length-1)  
        	return root;
        else
        	 root = new Node(arr[i]);
 
            // insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);
 
            // insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        
        return root;
    }
	
	// print in-order binary tree left -> root -> right
	public static void inOrder(Node root) 
    {
		if (root == null)
			return;
	else {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {5,4,6,7,8,9};
        Node root = insertLevelOrder(arr, 0);
        
        inOrder(root);
	}

}
