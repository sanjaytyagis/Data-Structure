package Graph;
import java.util.*;
public class CycleInGraphDFS {

	private boolean dfs(int node, int parent, int vis[], ArrayList<ArrayList<Integer>> adj) {
		
        vis[node] = 1; 
        // go to all adjacent nodes
        for(int adjacentNode: adj.get(node)) {
        	
            if(vis[adjacentNode]==0) {
                if(dfs(adjacentNode, node, vis, adj) == true)//avoid other recursion call if cycle
                    return true; 
            }
            // if adjacent node is visited and is not its own parent node
            else if(adjacentNode != parent)
            	return true; 
        }
        return false; 
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
    	
       int vis[] = new int[V];
       
       // This loop if graph has more than 1 components
       for(int i = 0;i<V;i++) {
           if(vis[i] == 0) {
               if(dfs(i, -1, vis, adj) == true) 
            	   return true; 
           }
       }
       return false; 
    }
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(1);
                
        CycleInGraphDFS obj = new CycleInGraphDFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");    
        else
            System.out.println("0");
    }

}
