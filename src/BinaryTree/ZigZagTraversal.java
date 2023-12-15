package BinaryTree;
import java.util.*;

public class ZigZagTraversal {

	public static ArrayList < ArrayList < Integer >> zigzagLevelOrder(Node root) {
        Queue < Node > queue = new LinkedList < Node > ();
        ArrayList < ArrayList < Integer >> wrapList = new ArrayList < > ();

        if (root == null) 
        	return wrapList;

        queue.offer(root);
        boolean flag = true;
        
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            
            ArrayList < Integer > subList = new ArrayList();
            
            for (int i = 0; i < levelNum; i++) {

                if (queue.peek().left != null) 
                	queue.add(queue.peek().left);
                
                if (queue.peek().right != null) 
                	queue.add(queue.peek().right);
                
                if (flag == true) 
                	subList.add(queue.remove().data);
                else 
                	subList.add(0, queue.remove().data); // to reverse add every element in beginning
            }
            flag = !flag; // logic to reverse a flag
            wrapList.add(subList);
        }
        return wrapList;
    }
	
	public static void main(String[] args) {
		int arr[] = {5,4,6};
        Node root = CreateBinaryTreeIteratively.insertLevelOrder(arr, 0);
        List<List<Integer>> result = RecursiveTreeTraversal.levelOrder(root);	
        System.out.println(result.toString());

	}

}
