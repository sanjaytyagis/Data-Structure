package BinaryTree;

/* MY LOGIC
    public int maxDepth(TreeNode root) {
         if(root == null)
        	return 0; 
        
        int lh = 1+maxDepth(root.left); 
        int rh = 1+maxDepth(root.right); 
        
        return Math.max(lh, rh); 
    }
*/

public class HeightBinaryTree {

	public static int height(Node root) {
		
        if(root == null)
        	return 0; 
        
        int lh = 1+ height(root.left); 
        int rh = 1+ height(root.right); 
        
        return Math.max(lh, rh); 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1,2};
	        Node root = CreateBinaryTreeIteratively.insertLevelOrder(arr, 0);
	        System.out.println(height(root));
	}
}
