import java.util.*;

public class cycleDetectionUndirectedGraphDFS6 {
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
        graph[0].add(new Edge(0, 3));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // 2 -> vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // 3 -> vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // 4 -> vertex
        graph[4].add(new Edge(4, 3));

    }

    // Time -> O(V+E)
    public static boolean cycleDetect(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (cycleDetectUtil(graph, visited, i, -1)) {
                    return true;
                    // cycle detected
                }
            }
        }
        return false;
    }

    public static boolean cycleDetectUtil(ArrayList<Edge> graph[], boolean visited[], int current, int parent) {
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            // case 3 -> current neighbor -> Not visited and cycle exists
            if (!visited[e.dest]) {
                if (cycleDetectUtil(graph, visited, e.dest, current)) {
                    return true;
                }
            } // case 2 -> current neighbor -> visited and and not parent
            else if (visited[e.dest] && e.dest != parent) {
                return true;
            }
            // case 1 -> current neighbor -> visited and parent
            // continue; -> do nothing

        }
        return false;

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /*
         * **** 0--------3
         * *** /|****** |
         * ** 1 |****** |
         * ***\|******* |
         * *** 2------ 4
         */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        if (cycleDetect(graph)) {
            System.out.println("cycle exists");
        } else {
            System.out.println("cycle does not exist");
        }

    }
}
