package Graph;
import java.util.*;
/*
 We cannot just call traversal(node) because a graph can have multiple components and traversal algorithms are designed in such a way 
 that they will traverse the entire connected portion of the graph
 
   adjList[0] will have all the nodes which are connected (neighbour) to vertex 0.
   adjList[1] will have all the nodes which are connected (neighbour) to vertex 1 and so on.
   
   cyclic graph example 0,1,2
   0->1->2
   1->0->2
   2->0->1
 */
public class GraphAdjacencyList {

	int vertex;
	List<List<Integer>> list;

    public GraphAdjacencyList(int vertex) {
    	
        this.vertex = vertex;
        list = new ArrayList < > ();
        
        for (int i = 0; i <vertex ; i++) 
        	list.add(new ArrayList < > ());
        
    }

    public void printGraph(){
        for (int i = 0; i <vertex ; i++) {
                System.out.print("Vertex " + i + " is connected to: ");
                
                for (int j = 0; j < list.get(i).size(); j++) 
                    System.out.print(list.get(i).get(j) + " ");
                
                System.out.println();
        }
    }
    
    public void addEdge(int source, int destination){

        //add forward edge
        list.get(source).add(destination);

        //add back edge ((for undirected)
        list.get(destination).add(source);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphAdjacencyList graph = new GraphAdjacencyList(5);
		
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
	}

}
