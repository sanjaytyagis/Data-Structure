package BinaryTree;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class BuildTreeFromInOrderAndPreOrder {
	
	
	// Recursive helper function to build the tree
    private TreeNode buildTree(Vector<Integer> preorder, int preStart, int preEnd,
    		
            Vector<Integer> inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        // Base case: If the start indices
        // exceed the end indices, return null
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        // Create a new TreeNode with value
        // at the current preorder index
        TreeNode root = new TreeNode(preorder.get(preStart));

        // Find the index of the current root
        // value in the inorder traversal
        int inRoot = inMap.get(root.val);

        // Calculate the number of
        // elements in the left subtree
        int numsLeft = inRoot - inStart;

        // Recursively build the left subtree
        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,
                inorder, inStart, inRoot - 1, inMap);

        // Recursively build the right subtree
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd,
                inorder, inRoot + 1, inEnd, inMap);

        // Return the current root node
        return root;
    }
    
    public TreeNode buildTree(Vector<Integer> preorder, Vector<Integer> inorder) {
        
        Map<Integer, Integer> inMap = new HashMap<>();
        // Map for mapping inorder element with indices to check from Post Order
        for (int i = 0; i < inorder.size(); i++) 
            inMap.put(inorder.get(i), i);

TreeNode root = buildTree(preorder, 0, preorder.size() - 1, inorder, 0, inorder.size() - 1, inMap);

        return root;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
