package BinaryTree;

public class PathSum {

    public static int maxPathDown(Node node, int maxValue[]) {
    	
        if (node == null) 
        	return 0;
        
        // if Math.max at every call not used then test case would fail for Input = [2,-1]
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));
        
        maxValue[0] = Math.max(maxValue[0], left + right + node.data); // calculating path for every node 
        
        return Math.max(left, right) + node.data; // which path to choose at every node right or left maximum
    }
    
	public static void main(String[] args) {
	
		int arr[] = {1,2,3};
        Node root = CreateBinaryTreeIteratively.insertLevelOrder(arr, 0);
        
		 int maxValue[] = new int[1];
	        maxValue[0] = Integer.MIN_VALUE;
	        maxPathDown(root, maxValue);
	        System.out.println(maxValue[0]);
	}

}
