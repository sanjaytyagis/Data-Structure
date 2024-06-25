package Graph;
import java.util.*;

// unconnected graph -> different components

// https://leetcode.com/problems/number-of-provinces/
public class Province {

	private static void dfs(int node,  List<List<Integer>> adjLs , int vis[]) {
        vis[node] = 1; 
        for(Integer it: adjLs.get(node)) {
            if(vis[it] == 0) 
                dfs(it, adjLs, vis); 
        }
    }

    public static List<List<Integer>> createAdjList(int[][] isConnected){
        List<List<Integer>> adj = new ArrayList();

        for(int i=0; i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
            for(int j=0; j<isConnected[0].length;j++){

                if(isConnected[i][j] == 1)
                adj.get(i).add(j);
            }
        }

        return adj;

    }
    
    // Main function Leetcode
    public int findCircleNum(int[][] isConnected) {

    List<List<Integer>> adj = createAdjList(isConnected);
    System.out.println(adj.toString());
    
        int component = 0;
        int vis[] = new int[isConnected.length];

        for(int i=0; i<vis.length;i++){
            if(vis[i] == 0){
                dfs(i,adj,vis);
                component++;
            }
        }
        return component;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
