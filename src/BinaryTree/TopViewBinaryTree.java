package BinaryTree;
import java.util.*;

class Pair{
	int hd;
	Node node = null;
	
	public Pair(Node node, int hd) {
		this.hd = hd;
		this.node = node;
	}
	
}
public class TopViewBinaryTree {

	static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList(); 
        
        if(root == null) 
        	return ans;
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        Queue<Pair> q = new LinkedList<Pair>();
        
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd; 
            Node temp = it.node; 
            
            if(map.get(hd) == null)
            	map.put(hd, temp.data);  // if vertical not there in Map then only add it
            
            if(temp.left != null) 
                q.add(new Pair(temp.left, hd - 1)); 
            
            if(temp.right != null) 
                q.add(new Pair(temp.right, hd + 1)); 
            
        }
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
            ans.add(entry.getValue()); 

        return ans;   
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
