import java.util.*;

public class BipartiteGraph7 {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        // 4 -> vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    // Time -> o(V+E)
    // if graph doesn't have cycle then -> Bipartite Graph
    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) { // BFS
                q.add(i);
                col[i] = 0; // yellow or 1 -> blue

                while (!q.isEmpty()) {
                    int current = q.remove();
                    for (int j = 0; j < graph[current].size(); j++) {
                        Edge e = graph[current].get(j); // e.dest
                        // 1) case -> not color then give color and add in Queue
                        if (col[e.dest] == -1) {
                            int nextColor = col[current] == 0 ? 1 : 0;
                            col[e.dest] = nextColor;
                            q.add(e.dest);

                        } // 2) case -> both current and hit destination color are same color
                        else if (col[e.dest] == col[current]) {
                            return false; // Not Bipartite
                        }
                        // 3) case -> current and hit destination color are different color
                        // then continue -> do nothing
                    }
                }

            }
        }
        return true;

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /*
         * **** 0---2
         * *** /***|
         * ** 1 **4
         * ***\**|
         * *****3
         */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
