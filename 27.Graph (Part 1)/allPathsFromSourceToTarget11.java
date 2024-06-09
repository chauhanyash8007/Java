import java.util.*;

public class allPathsFromSourceToTarget11 {
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

        // 0 -> Vertex
        graph[0].add(new Edge(0, 3));

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

    // Time -> Exponential
    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + dest + " ");
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path + src);
        }

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 5, dest = 1;
        printAllPath(graph, src, dest, "");

    }
}
