package BinaryTree;
import java.util.*;

public class IterativeTreeTraversal {

	// pre Order Traversal Using Stack 
	static ArrayList < Integer > preOrderTrav(Node curr) {
        ArrayList < Integer > preOrder = new ArrayList < Integer > ();
        if (curr == null)
            return preOrder;

        Stack < Node > s = new Stack < > ();
        s.push(curr);

        while (!s.isEmpty()) {
            Node topNode = s.peek();
            preOrder.add(topNode.data);
            s.pop();
            if (topNode.right != null)
                s.push(topNode.right);
            if (topNode.left != null)
                s.push(topNode.left);
        }
        return preOrder;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {5,4,6};
	        Node root = CreateBinaryTreeIteratively.insertLevelOrder(arr, 0);
	       List<Integer> result = IterativeTreeTraversal.preOrderTrav(root);	
	        System.out.println(result.toString());
	}
}
