package BinarySerachTree;

public class SearchInBST {

	Node result = null;
	
    public Node searchBST(Node root, int data) {

        if(root == null)
        return null;

        if(root.value == data){
            result = root;// when value available store in global field and return
        }
        
        if(data < root.value )// to optimize in log(n)
         searchBST(root.left,data);
         
        if(data > root.value ) // to optimize in log(n)
         searchBST(root.right,data);
         
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
