import java.util.*;

public class PrimsAlgorithm3 {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        // 2 -> vertex
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void getPrims(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));

        int finalCost = 0; // MST cost or total min weight
        ArrayList<Pair> list = new ArrayList<>();

        while (!pq.isEmpty()) {
            Pair current = pq.remove();
            if (!vis[current.v]) {
                list.add(new Pair(current.v, current.cost));
                vis[current.v] = true;
                finalCost += current.cost;
                for (int i = 0; i < graph[current.v].size(); i++) {
                    Edge e = graph[current.v].get(i);
                    pq.add(new Pair(e.dest, e.weight));
                }
            }
        }
        System.out.println("final cost of MST: " + finalCost);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("vertex = " + list.get(i).v + " cost = " + list.get(i).cost);
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        getPrims(graph);

    }
}
