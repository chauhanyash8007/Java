import java.util.*;

public class cycleDetectionDirectedGraphDFS8 {
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

        // 0 -> vertex
        graph[0].add(new Edge(0, 2));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0));

        // 2 -> vertex
        graph[2].add(new Edge(2, 3));

        // 3 -> vertex
        graph[3].add(new Edge(3, 0));

    }

    // Time -> o(V+E)
    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int current, boolean vis[], boolean stack[]) {
        vis[current] = true;
        stack[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (stack[e.dest]) { // cycle
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }

        }
        stack[current] = false;
        return false;

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        if (isCycle(graph)) {
            System.out.println("cycle exists");
        } else {
            System.out.println("cycle does not exist");
        }

    }
}
