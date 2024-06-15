// Time -> O(V + E log E)

import java.util.ArrayList;
import java.util.Collections;

public class KruskalsAlgorithm7 {
    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.weight - e2.weight;
        }
    }

    static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));

    }

    static int n = 4;
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Time Complexity -> O(1) it is (find) optimized Data Structures
    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]); // path compression
    }

    // Time Complexity -> O(1) (Union) optimized Data Structures
    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            parent[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            parent[parA] = parB;
        } else {
            parent[parB] = parA;
        }

    }

    public static void KruSkAlsMast(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1; i++) {
            Edge e = edges.get(i);
            // src,dest,wt
            int parA = find(e.src); // src=a
            int parB = find(e.dest); // dest=b
            // parA==parB -> cycle condition -> then do nothing
            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.weight;
                count++;
            }
        }
        System.out.println("Minimum cost: " + mstCost);

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        KruSkAlsMast(graph, V);

    }
}
