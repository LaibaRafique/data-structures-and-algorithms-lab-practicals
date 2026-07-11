// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package bfstraversal;
import java.util.LinkedList;
import java.util.Queue;
public class BFSTraversal {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;
    public BFSTraversal(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }
    public void bfsTraversal(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex] = true;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        BFSTraversal graph = new BFSTraversal(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        System.out.println("BFS Traversal starting from vertex 0:");
        graph.bfsTraversal(0);
        System.out.println("");
    }
}
