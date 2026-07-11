// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package dfstraversal;
import java.util.LinkedList;
public class DFSTraversal {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;
    public DFSTraversal(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }
    public void dfsTraversal(int startVertex) {
        boolean[] visited = new boolean[vertices];
        dfsRecursive(startVertex, visited);
    }
    private void dfsRecursive(int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");
        for (int neighbor : adjacencyList[currentVertex]) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited);
            }
        }
    }
    public static void main(String[] args) {
        DFSTraversal graph = new DFSTraversal(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        System.out.println("DFS Traversal starting from vertex 0:");
        graph.dfsTraversal(0);
        System.out.println("");
    }
}
