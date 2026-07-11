// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package bfsanddfsgraph2;
import java.util.*;
class Graph {
    private Map<Integer, List<Integer>> adjacencyList;
    public Graph() {
        this.adjacencyList = new HashMap<>();
    }
    public void addEdge(int vertex1, int vertex2) {
        adjacencyList.computeIfAbsent(vertex1, k -> 
                new ArrayList<>()).add(vertex2);
        adjacencyList.computeIfAbsent(vertex2, k -> 
                new ArrayList<>()).add(vertex1);
    }
    public void breadthFirstSearch(int startVertex) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(startVertex);
        queue.add(startVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            List<Integer> neighbors = adjacencyList.get(currentVertex);
            if (neighbors != null) {
                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
    public void depthFirstSearch(int startVertex) {
        Set<Integer> visited = new HashSet<>();
        depthFirstSearchUtil(startVertex, visited);
    }
    private void depthFirstSearchUtil(int currentVertex, Set<Integer> visited) {
        visited.add(currentVertex);
        System.out.print(currentVertex + " ");

        List<Integer> neighbors = adjacencyList.get(currentVertex);
        if (neighbors != null) {
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    depthFirstSearchUtil(neighbor, visited);
                }
            }
        }
    }
}
public class BFSAndDFSGraph2 {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(40, 20);
        graph.addEdge(40, 10);
        graph.addEdge(20, 10);
        graph.addEdge(20, 30);
        graph.addEdge(20, 60);
        graph.addEdge(20, 50);
        graph.addEdge(10, 30);
        graph.addEdge(30, 60);
        graph.addEdge(50, 70);
        graph.addEdge(60, 70);
        System.out.println("BFS starting from vertex 40:");
        graph.breadthFirstSearch(40);
        System.out.println();
        System.out.println("DFS starting from vertex 40:");
        graph.depthFirstSearch(40);
        System.out.println();
    }
}
