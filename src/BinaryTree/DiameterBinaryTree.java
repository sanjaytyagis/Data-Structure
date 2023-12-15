package BinaryTree;

//Diameter is the length of the longest path between any 2 nodes in the tree and this path may or may not pass from the root.

/* o(n2) solution
   if (root == null) {
            return 0;
        }
        
         int leftDiameter = diameterOfBinaryTree(root.left);    // maximum diameter left path mai bhi ho skta hai
        int rightDiameter = diameterOfBinaryTree(root.right); // maximum diameter right path mai bhi ho skta hai
        
        int leftHeight = HeightBinaryTree.height(root.left);
        int rightHeight = HeightBinaryTree.height(root.right);

									 // (leftHeight + rightHeight) maximun dia dono ko mila krr bhi ho skta hai
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
 */
public class DiameterBinaryTree {

	private static int diameterOfBinaryTree(Node node, int[] diameter) {
        if (node == null) {
            return 0;
        }
        int lh = diameterOfBinaryTree(node.left, diameter);
        int rh = diameterOfBinaryTree(node.right, diameter);
        
        diameter[0] = Math.max(diameter[0], lh + rh); // calculating Diameter for every node 
        
        return 1 + Math.max(lh, rh); // which path to choose at every node right or left maximum
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2};
        Node root = CreateBinaryTreeIteratively.insertLevelOrder(arr, 0);
        int[] diameter = new int[1];
        diameterOfBinaryTree(root, diameter);
        System.out.println(diameter[0]);        
	}
}
