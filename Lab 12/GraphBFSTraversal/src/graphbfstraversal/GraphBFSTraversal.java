// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package graphbfstraversal;
import java.util.LinkedList;
import java.util.Queue;
public class GraphBFSTraversal {
    private int V; 
    private LinkedList<Integer>[] adjList; 
    public GraphBFSTraversal(int vertices) {
        V = vertices;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            for (int neighbor : adjList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        GraphBFSTraversal myGraph = new GraphBFSTraversal(7);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(1, 4);
        myGraph.addEdge(2, 5);
        myGraph.addEdge(2, 6);
        myGraph.addEdge(3, 6);
        System.out.println("BFS Traversal starting from vertex 0:");
        myGraph.BFS(0);
    }
}
