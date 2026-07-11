// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package bfsanddfsgraph1;
import java.util.*;
public class BFSAndDFSGraph1 {
    static class DepthGraph {
        private int V;
        private LinkedList<Integer> adj[];

        public DepthGraph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList();
            }
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        void DFSUtil(int v, boolean visited[]) {
            System.out.print(v + " ");
            visited[v] = true;
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }

        void DFS() {
            boolean visited[] = new boolean[V];

            for (int i = 0; i < V; ++i) {
                if (!visited[i]) {
                    DFSUtil(i, visited);
                }
            }
        }
    }

    static class BreadthGraph {
        private int V;
        private LinkedList<Integer> adj[];

        public BreadthGraph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList();
            }
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        void BFS(int s) {
            boolean visited[] = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(s);
            visited[s] = true;
            while (queue.size() != 0) {
                s = queue.poll();
                System.out.print(s + " ");

                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        BreadthGraph g = new BreadthGraph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 0);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(2, 4);
        g.addEdge(3, 0);
        g.addEdge(4, 2);
        System.out.println("Following is Breadth First Traversal "
                + "(starting from vertex 0)");
        g.BFS(0);

        DepthGraph g2 = new DepthGraph(5);
        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(0, 3);
        g2.addEdge(1, 0);
        g2.addEdge(1, 2);
        g2.addEdge(2, 0);
        g2.addEdge(2, 1);
        g2.addEdge(2, 4);
        g2.addEdge(3, 0);
        g2.addEdge(4, 2);
        System.out.println("\nFollowing is Depth First Traversal "
                + "(starting from vertex 0)");
        g2.DFS();
    }
}
