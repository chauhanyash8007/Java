import java.util.*;

public class bellManFord2 {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph) {

        // 0 -> vertex
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        // 1 -> vertex
        graph.add(new Edge(1, 2, -4));

        // 2 -> vertex
        graph.add(new Edge(2, 3, 2));

        // 3 -> vertex
        graph.add(new Edge(3, 4, 4));

        // 4 -> vertex
        graph.add(new Edge(4, 1, -1));

    }

    public static void bellManFord(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        // Time -> O(V)
        for (int i = 0; i < V - 1; i++) {
            // Time edge -> O(E)
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j);
                // u,v,wt
                int u = e.src;
                int v = e.dest;
                int wt = e.weight;
                // relaxation
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }

            }

        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        bellManFord(graph, 0, v);

    }
}
