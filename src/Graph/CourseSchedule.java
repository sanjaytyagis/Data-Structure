package Graph;
import java.util.*;

class CourseSchedule {
	
		 Stack<Integer> st = new Stack<Integer>();
		    private boolean dfs(List<List<Integer>> adj, boolean[] visited, boolean[] pathVis, int course){
		       
		        visited[course] = true; 
		        pathVis[course] = true; 
		        
		        // traverse for adjacent nodes 
		        for(int it : adj.get(course)) {
		            // when the node is not visited 
		            if(visited[it] == false) {
		                if(dfs(adj,visited, pathVis,it) == true) 
		                    return true; 
		            }
		            // if the node has been previously visited
		            // but it has to be visited on the same path 
		            else if(pathVis[it] == true) 
		                return true; 
		            
		        }
		        
		        pathVis[course] = false; 
		        st.push(course);
		        return false; 
		    }

		    public int[] findOrder(int numCourses, int[][] prerequisites) {
		        List<List<Integer>> adj = new ArrayList<>();

		        for(int i = 0; i < numCourses; i++)
		            adj.add(new ArrayList<>());

		        boolean[] visited = new boolean[numCourses];
		        boolean[] pathVis = new boolean[numCourses];

		        for(int i = 0; i < prerequisites.length; i++)
		            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);

		        for(int i = 0; i < numCourses; i++){
		            if(visited[i] == false){
		            if(dfs(adj, visited, pathVis, i)==true) // if cysle is there then course can't be completred
		                return new int[0];
		            }
		        }
		        
		        int ans[] = new int[numCourses];
		        int i = 0;
		        while (!st.isEmpty()) {
		            ans[i++] = st.peek();
		            st.pop();
		        }
		        return ans;
		        
		    }
		    
		    public static void main(String[] args) 
		    {
		    }
		    
}
