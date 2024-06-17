// Tarjan_s Algorithm (for UnDirected graph ) -> Using DFS -> Time -> O(V+E)

import java.util.*;

public class bridgeInGraph2 {
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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));

    }

    public static void dfs(ArrayList<Edge> graph[], int current, int par, int dt[], int lowDt[], boolean vis[],
            int time) {
        vis[current] = true;
        dt[current] = lowDt[current] = ++time;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i); // src -> dest
            int neighbor = e.dest;
            if (neighbor == par) { // for current -> neighbor == Parent
                continue;
            } else if (!vis[neighbor]) { // for current -> neighbor not visited
                dfs(graph, neighbor, current, dt, lowDt, vis, time);
                lowDt[current] = Math.min(lowDt[current], lowDt[neighbor]);
                if (dt[current] < lowDt[neighbor]) {
                    System.out.println("Bridge : " + current + " ---> " + neighbor);
                }
            } else { // for current -> not neighbor and already visited
                lowDt[current] = Math.min(lowDt[current], dt[neighbor]);
            }
        }

    }

    public static void TarjanBridge(ArrayList<Edge> graph[], int V) {
        // dt = discovery time
        // lowDt = lowest discovery time
        int dt[] = new int[V];
        int lowDt[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, lowDt, vis, time);

            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        TarjanBridge(graph, v);

    }
}
