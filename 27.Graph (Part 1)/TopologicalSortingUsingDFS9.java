import java.util.*;

public class TopologicalSortingUsingDFS9 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // There is no going direction from vertex 0 and 1
        // 2 -> vertex
        graph[2].add(new Edge(2, 3));

        // 2 -> vertex
        graph[3].add(new Edge(3, 1));

        // 4 -> vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // 5 -> vertex
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    // Time -> o(V+E)
    public static void TopologicalSorting(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                TopologicalSortingUtil(graph, i, vis, s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void TopologicalSortingUtil(ArrayList<Edge> graph[], int current, boolean vis[],
            Stack<Integer> s) {

        vis[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!vis[e.dest]) {
                TopologicalSortingUtil(graph, e.dest, vis, s);
            }
        }
        s.push(current);

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        TopologicalSorting(graph);

    }
}
