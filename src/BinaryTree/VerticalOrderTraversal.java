package BinaryTree;
import java.util.*;

class Tuple { // Tupple create to store the node,vertical,level of particular node
    Node node;
    int row; // row is Horizontal
    int col; // col is Vertical
    public Tuple(Node _node, int _row, int _col) {
        node = _node;
        row = _row;
        col = _col;
    }
}

public class VerticalOrderTraversal {

	public static List < List < Integer >> findVertical(Node root) {
		
        TreeMap < Integer, TreeMap < Integer, PriorityQueue < Integer >>> map = new TreeMap();
        // Priority Queue to get all elements in sorted order
        
        Queue < Tuple > q = new LinkedList();
        
        q.offer(new Tuple(root, 0, 0));
        
        while (!q.isEmpty()) { // O(n)
            Tuple tuple = q.poll();
            Node node = tuple.node;
            int x = tuple.row; // x is Horizontal
            int y = tuple.col; // y is Vertical

            // check Horizontal there or not 
            if (!map.containsKey(x)) { 
                map.put(x, new TreeMap());
            }
            // check Vertical there or not  
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue());
            }
            
            map.get(x).get(y).offer(node.data); // to enter data to Priority Queue (log(n))

            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1)); // add data to Tuple
            }
            
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));  // add data to Tuple
            }
        }
        
        List < List < Integer >> list = new ArrayList < > ();
        
        // Iterate Map data 
        for (TreeMap < Integer, PriorityQueue < Integer >> ys: map.values()) {
            list.add(new ArrayList < > ());
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll()); // getting the List and addidng the element into that list
                }
            }
        }
        return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
