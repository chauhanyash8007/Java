// Tarjan_s Algorithm -> DFS 
// UnDirected Graph
// Time -> O(V+E)

import java.util.*;

public class ArticulationPoint3 {
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

        graph[4].add(new Edge(4, 3));

    }

    public static void dfs(ArrayList<Edge> graph[], int current, int par, int dt[], int lowDT[], int time,
            boolean vis[], boolean ap[]) {
        vis[current] = true;
        dt[current] = lowDT[current] = ++time;
        int children = 0;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i); // src -> dest
            int neighbor = e.dest;
            if (neighbor == par) { // for current -> neighbor == Parent
                continue;
            } else if (vis[neighbor]) { // for current -> not neighbor and already visited
                lowDT[current] = Math.min(lowDT[current], dt[neighbor]);
            } else { // for current -> neighbor not visited
                dfs(graph, neighbor, current, dt, lowDT, time, vis, ap);
                lowDT[current] = Math.min(lowDT[current], lowDT[neighbor]);
                if (par != -1 && dt[current] <= lowDT[neighbor]) {
                    ap[current] = true;
                }
                children++;
            }
        }
        if (par == -1 && children > 1) {
            ap[current] = true;

        }

    }

    public static void getAp(ArrayList<Edge> graph[], int v) {
        // dt = discovery time
        // lowDt = lowest discovery time
        int dt[] = new int[v];
        int lowDT[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];
        boolean ap[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, lowDT, time, vis, ap);

            }
        }
        // To Print All Articulation Points
        for (int i = 0; i < v; i++) {
            if (ap[i]) {
                System.out.println("Articulation Point " + i);

            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        getAp(graph, v);

    }
}
