// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package dfsrecursivetraversal;
import java.util.LinkedList;
public class DFSRecursiveTraversal {
    private int V; 
    private LinkedList<Integer>[] adjList; 
    public DFSRecursiveTraversal(int vertices) {
        V = vertices;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }
    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[V];
        DFSUtil(startVertex, visited);
    }
    public static void main(String[] args) {
        DFSRecursiveTraversal graph = new DFSRecursiveTraversal(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 6);
        System.out.println("DFS Traversal starting from vertex 0:");
        graph.DFS(0);
    }
}
