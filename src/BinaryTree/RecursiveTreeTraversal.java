package BinaryTree;
import java.util.*;

/*
 // In-Order Traversal
  
     static void inOrderTrav(Node curr, ArrayList < Integer > inOrder) {
        if (curr == null)
            return;

        inOrderTrav(curr.left, inOrder);
        inOrder.add(curr.data);
        inOrderTrav(curr.right, inOrder);
    }
    
    // Pre-Order Traversal --> use of Pre-order is to get copy of Tree, and to generate Prefix expression.
  
     if (curr == null)
            return;

        preOrder.add(curr.data);
        preOrderTrav(curr.left, preOrder);
        preOrderTrav(curr.right, preOrder);
    }
    
    // Post-Order Traversal --> use of Post-order is to delete the tree and to to generate Post-fix expression.
  
     if (curr == NULL)
    	return;

  		postOrderTrav(curr -> left, postOrder);
  		postOrderTrav(curr -> right, postOrder);
  		postOrder.push_back(curr -> data);
  
    }
 */

/*
  // Level-Order Traversal --> in this every node in the tree is visited level by level.
   
  		Remove a node from queue.
		Print the node.
		Add all of its children in the queue


 // Level Order Traversal --> Breadth First Search and used to find connected components in graph data structure.

Take a queue data structure and push the root node to the queue.
Set a while loop which will run till our queue is non-empty.
In every iteration, pop out from the front of the queue and assign it to a variable (say temp).
If temp has a left child, push it to the queue.
If temp has a right child, push it to the queue.
At last push the value of the temp node to our “ans” data structure.

 */

// Level Order Traversal logic
public class RecursiveTreeTraversal {

	public static List<List<Integer>> levelOrder(Node root) {
	       Queue<Node> queue = new LinkedList<>();
	        List<List<Integer>> wrap = new LinkedList<List<Integer>>();

	        if(root==null) 
	        return wrap;

	        queue.add(root);

	        while(!queue.isEmpty()){
	            List<Integer> list = new LinkedList<>();
	            int num = queue.size();
	            
	            for(int i=0; i<num; i++){ // for loop to traverse all the node at each level
	            	
	                if(queue.peek().left!=null) 
	                queue.add(queue.peek().left); // add left child to queue

	                if(queue.peek().right!=null)
	                 queue.add(queue.peek().right); // add left child to queue
	                 
	          list.add(queue.remove().data); // add every node in list means remove from queue at each level and add to list
	            }
	            wrap.add(list);
	        }
	        return wrap;
	    }

	public static void main(String[] args) {
		 int arr[] = {5,4,6};
	        Node root = CreateBinaryTreeIteratively.insertLevelOrder(arr, 0);
	        List<List<Integer>> result = RecursiveTreeTraversal.levelOrder(root);	
	        System.out.println(result.toString());
	}
}
