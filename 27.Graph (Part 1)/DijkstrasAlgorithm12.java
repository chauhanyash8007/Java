import java.util.*;

public class DijkstrasAlgorithm12 {
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
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        // 2 -> vertex
        graph[2].add(new Edge(2, 4, 3));

        // 3 -> vertex
        graph[3].add(new Edge(3, 5, 1));

        // 4 -> vertex
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    static class Pair implements Comparable<Pair> {
        int node;
        int path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // smallest path based sorting for my pairs.
        }
    }

    // Time with Priority Queue -> O(V + E log V)
    // Time without Priority Queue -> O(V^2)
    public static void DijKSTRas(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // dist[i] -> src to dist[i];
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // + Infinity
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.remove();
            if (!vis[current.node]) {
                vis[current.node] = true;
                // neighbor
                for (int i = 0; i < graph[current.node].size(); i++) {
                    Edge e = graph[current.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;
                    if (dist[u] + wt < dist[v]) { // update distance of src to v
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }

        }
        // print all src to vertices shortest distance
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int scr = 0;
        DijKSTRas(graph, scr);

    }

}
