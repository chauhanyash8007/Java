import java.util.*;

public class BellManFordAlgorithm1 {
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

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -> vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // 1 -> vertex
        graph[1].add(new Edge(1, 2, -4));

        // 2 -> vertex
        graph[2].add(new Edge(2, 3, 2));

        // 3 -> vertex
        graph[3].add(new Edge(3, 4, 4));

        // 4 -> vertex
        graph[4].add(new Edge(4, 1, -1));

    }

    // Time -> O(V*E)
    public static void bellManFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        // Time -> O(V)
        for (int i = 0; i < V - 1; i++) {
            // Time edge -> O(E)
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
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

        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellManFord(graph, 0);

    }
}