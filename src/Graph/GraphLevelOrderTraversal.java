package Graph;
import java.util.*;

public class GraphLevelOrderTraversal {

	public static List<List<Integer>> bfsLevelOrder(List<List<Integer>> graph, int start) {
        // Result list to store nodes level by level
        List<List<Integer>> result = new ArrayList<>();
        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        // Array to keep track of visited nodes
        boolean[] visited = new boolean[graph.size()];

        // Start with the given node
        queue.offer(start);
        visited[start] = true;

        // Perform BFS
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                int currentNode = queue.poll();
                level.add(currentNode);
                //visited[currentNode] = true;
                // Enqueue all unvisited neighbors
                for (int neighbor : graph.get(currentNode)) {
                    if (!visited[neighbor]) {
                        queue.offer(neighbor);
                        visited[neighbor] = true;
                    }
                }
            }
            result.add(level);
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example usage:
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(Arrays.asList(1, 2));    // Node 0's neighbors
        graph.add(Arrays.asList(0, 3, 4)); // Node 1's neighbors
        graph.add(Arrays.asList(0, 5));    // Node 2's neighbors
        graph.add(Arrays.asList(1));       // Node 3's neighbors
        graph.add(Arrays.asList(1));       // Node 4's neighbors
        graph.add(Arrays.asList(2));       // Node 5's neighbors

        int startNode = 0;
        List<List<Integer>> traversal = bfsLevelOrder(graph, startNode);

        // Print the level order traversal
        for (List<Integer> level : traversal) {
            System.out.println(level);
        }
	}

}
