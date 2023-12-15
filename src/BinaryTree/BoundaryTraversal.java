package BinaryTree;
import java.util.*;
public class BoundaryTraversal {

	static Boolean isLeaf(Node root) {
        return (root.left == null) && (root.right == null);
    }

    static void addLeftBoundary(Node root, List < Integer > res) {
        Node cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false)
            	res.add(cur.data);
            
            if (cur.left != null) // left lena hai ya right lena hai
            	cur = cur.left;
            else 
            	cur = cur.right;
        }
    }
    
    static void addLeaves(Node root, List < Integer > res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null)
        	addLeaves(root.left, res);
        if (root.right != null) 
        	addLeaves(root.right, res);
    }
    
    static void addRightBoundary(Node root, List < Integer > res) {
        Node cur = root.right;
        List < Integer > tmp = new ArrayList();
        
        while (cur != null) {
            if (isLeaf(cur) == false) 
            	tmp.add(cur.data);
            if (cur.right != null) 
            	cur = cur.right;
            else 
            	cur = cur.left;
        }
        
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {  // used to print the right part in reverse order
            res.add(tmp.get(i)); // reversing the tenp list and adding to ans list
        }
    }
    
    static ArrayList < Integer > printBoundary(Node node) {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        
        if (isLeaf(node) == false) // printing root because left and right is excluding root
        	ans.add(node.data);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 5,4,6};
	        Node root = CreateBinaryTreeIteratively.insertLevelOrder(arr,0);
		ArrayList < Integer > boundaryTraversal = printBoundary(root);
		System.out.println(boundaryTraversal.toString());
	}

}
