import java.util.*;

public class cheapestFlightsWithinKStops4 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static int cheapestFlight(int n, int flights[][], int src, int dest, int k, ArrayList<Edge> graph[]) {

        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info current = q.remove();

            if (current.stops > k) {
                break;
            }

            for (int i = 0; i < graph[current.v].size(); i++) {
                Edge e = graph[current.v].get(i);
                // int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if (current.cost + wt < dist[v] && current.stops <= k) {

                    dist[v] = current.cost + wt;
                    q.add(new Info(v, dist[v], current.stops + 1));

                }
            }
        }

        // dist[dest]
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }

    }

    @SuppressWarnings("unchecked")

    public static void main(String[] args) {
        int n = 4;
        int flights[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dest = 3, k = 1;
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);
        System.out.println(
                "cheapestFlight Cost Within Given Stops k = " + cheapestFlight(n, flights, src, dest, k, graph));

    }
}
