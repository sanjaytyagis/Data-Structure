package Graph;
import java.util.*;

public class TopologicalSortBFSKahnsAlgo {

	// Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
    	
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
// in acyclic graph start and end node would have 0 inDegree
        Queue<Integer> q = new LinkedList<Integer>();
        // add vertices whose in degree would be zero
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // resultant array
        int topo[] = new int[V];
        int i = 0;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            // store node in resultant array
            topo[i] = node;
            i++;
            // node is in your topo sort
            // so please remove it from the indegree

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0)
                    q.add(it);
            }
        }

        return topo;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int V = 6;
	        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	        for (int i = 0; i < V; i++) {
	            adj.add(new ArrayList<>());
	        }
	        adj.get(2).add(3);
	        adj.get(3).add(1);
	        adj.get(4).add(0);
	        adj.get(4).add(1);
	        adj.get(5).add(0);
	        adj.get(5).add(2);

	        int[] ans = TopologicalSortBFSKahnsAlgo.topoSort(V, adj);
	        for (int node : ans) {
	            System.out.print(node + " ");
	        }
	        System.out.println("");
	}

}
