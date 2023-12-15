package BinaryTree;

public class IdenticalTrees {

	static boolean isIdentical(Node node1, Node node2) {
        if (node1 == null && node2 == null)
            return true;
        else if (node1 == null || node2 == null)
            return false;

        boolean left = isIdentical(node1.left, node2.left);
        boolean right = isIdentical(node1.right, node2.right);
        
        return ((node1.data == node2.data) && left && right);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
