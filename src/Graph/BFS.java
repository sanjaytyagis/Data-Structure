package Graph;
import java.util.*;

/*

1 -> Visited array: an array initialized to 0
2 -> In BFS, we start with a “starting” node, mark it as visited, and push it into the queue data structure.
3 -> In every iteration, we pop out the node ‘v’ and put it in the resultant list i.e BFS, as we are traversing this node.
 All the unvisited adjacent nodes from vertex ‘v’ are visited next and are pushed into the queue. 
4 -> Repeat steps 2 and 3 until the queue becomes empty, and this way you can easily traverse all the nodes in the graph.
 */
public class BFS {

	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		        
		        ArrayList < Integer > bfs = new ArrayList < > ();
		        boolean vis[] = new boolean[V];
		        Queue < Integer > q = new LinkedList();

		        q.add(0);
		        vis[0] = true;

		        while (!q.isEmpty()) {
		            Integer node = q.poll();
		            bfs.add(node);

		            // Get all adjacent vertices of the dequeued vertex s
		            // If a adjacent has not been visited, then mark it
		            // visited and enqueue it
		            for (Integer it: adj.get(node)) {
		                if (vis[it] == false) {
		                    vis[it] = true;
		                    q.add(it);
		                }
		            }
		        }

		        return bfs;
		    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vertices = 5;
		int edges = 10;
		ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
		
		// Adjacency list creation can be done via inputs given in the form of
        for (int i = 0; i < vertices; i++) 
            adj.add(new ArrayList());
        
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        System.out.println("Adjacency List");
        for (ArrayList<Integer> arrayList : adj) 
        	System.out.print(arrayList.toString()+" ");
        
        System.out.println(); 
        System.out.println("BFS");
        BFS sl = new BFS(); 
        ArrayList < Integer > ans = sl.bfsOfGraph(5, adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) 
            System.out.print(ans.get(i)+" "); 
        
	}

}
