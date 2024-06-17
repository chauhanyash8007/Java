import java.util.*;

// kosaraju_s Algorithm -> using Reverse DFS -> Time O(V+E)
// Directed Graph

public class stronglyConnectedComponents1 {

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
            graph[i] = new ArrayList<Edge>();

        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));

    }

    public static void topSort(ArrayList<Edge> graph[], int current, boolean vis[], Stack<Integer> s) {
        vis[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(current);
    }

    public static void DFS(ArrayList<Edge> graph[], int current, boolean vis[]) {
        vis[current] = true;
        System.out.print(current + " ");
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }

    }

    @SuppressWarnings("unchecked")
    public static void kosaraju(ArrayList<Edge> graph[], int v) {
        // step 1 -> do top sort
        boolean vis[] = new boolean[v];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // step 2 -> create transposed graph
        ArrayList<Edge> transpose[] = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j); // e-> e.src to e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src)); // reverse edge
            }
        }

        // step 3 perform DFS For each Element removing from stack
        while (!s.isEmpty()) {
            int current = s.pop();
            if (!vis[current]) {
                System.out.print(" SCC-> ");
                DFS(transpose, current, vis);
                System.out.println();

            }
        }

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        kosaraju(graph, v);

    }
}