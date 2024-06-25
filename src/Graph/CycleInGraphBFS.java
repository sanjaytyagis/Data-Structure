package Graph;
import java.util.*;

class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second; 
    }
}

public class CycleInGraphBFS {

    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[]) {
        Queue<Node> q = new LinkedList<>(); // BFS
        q.add(new Node(s, -1));
        vis[s] = true;
       
        // until the queue is empty
        while (!q.isEmpty()) {
            // source node and its parent node
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove(); 
           
            // go to all the adjacent nodes
            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    q.add(new Node(it, node));
                    vis[it] = true; 
                }
                // if adjacent node is visited and is not its own parent node
                else if (par != it) {
                    return true;
                }
            }
        }
       
        return false;
    }
    
    // function to detect cycle in an undirected graph
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];

     // This loop if graph has more than 1 components
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (checkForCycle(adj, i, vis)) {
                    return true;
                }
            }
        }
    
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(1);
                
        CycleInGraphBFS obj = new CycleInGraphBFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}