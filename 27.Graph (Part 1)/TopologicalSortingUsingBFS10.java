// Kahn's algorithm

import java.util.*;

public class TopologicalSortingUsingBFS10 {
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

        // There is no going direction from vertex 0 and 1
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

    public static void calculateInDegree(ArrayList<Edge> graph[], int indDeg[]) {
        for (int i = 0; i < graph.length; i++) {
            int V = i;
            for (int j = 0; j < graph[V].size(); j++) {
                Edge e = graph[V].get(j);
                indDeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int indDeg[] = new int[graph.length];
        calculateInDegree(graph, indDeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indDeg.length; i++) {
            if (indDeg[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int current = q.remove();
            System.out.print(current + " ");

            for (int i = 0; i < graph[current].size(); i++) {
                Edge e = graph[current].get(i);
                indDeg[e.dest]--;
                if (indDeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topSort(graph);

    }
}
