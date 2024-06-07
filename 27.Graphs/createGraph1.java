// Creating A Graph Using -> (Adjacency List)

import java.util.*;

public class createGraph1 {
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

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /*
         * ----(5)------
         * 0-----------1
         * -----------/ \(3)
         * -------(1)/ - \
         * ---------2----3
         * -------- | (1)
         * -----(2) |
         * -------- 4
         * 
         */
        // count of vertices = array size
        int vertices = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -> vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 -> vertex
        graph[4].add(new Edge(4, 2, 2));

        // 2' neighbors Time -> O(1)
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i); // e -> sec,dest,weight
            System.out.println(e.dest);

        }

    }
}