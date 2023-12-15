package BinaryTree;

/* difference between left and right height of tree at every node should be <=1 then It's a balanced tree\
  
   check height of left and right tree less than equal to 1 and then check whether tree is balanced or not
   
   T>C = 0(n2) because height is being calculated every time and balanced also checxking every time
   
   public static boolean isBalanced(Node root) {
		
    if (root == null)
        return true;

		boolean lb = isBalanced(root.left);
		boolean rb = isBalanced(root.right);
		
     int lh = HeightBinaryTree.height(root.left);
     int rh = HeightBinaryTree.height(root.right);

    if (Math.abs(lh - rh) <= 1 && lb && rb)
        return true;

    return false;
    }
 
 */
public class BalancedTree {

	// height to check at every node o(n) solution
	static int dfsHeight (Node root) {
        if (root == null)
        	return 0;
        
        int leftHeight = dfsHeight (root.left);
        if (leftHeight == -1) 
        	return -1;
        
        int rightHeight = dfsHeight (root.right);
        if (rightHeight == -1)
        	return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1) 
        	return -1;
        
        return Math.max(leftHeight, rightHeight) + 1; // which path to choose at every node right or left 
    }
	
	public static boolean isBalanced(Node root) {
        return dfsHeight (root) != -1;
    }

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
        Node root = CreateBinaryTreeIteratively.insertLevelOrder(arr, 0);
        System.out.println(BalancedTree.isBalanced(root));
	}
}
