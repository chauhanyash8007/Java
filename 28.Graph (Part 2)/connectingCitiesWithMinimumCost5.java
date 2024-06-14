import java.util.*;

public class connectingCitiesWithMinimumCost5 {
    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int d, int c) {
            this.dest = d;
            this.cost = c;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost;
        }
    }

    public static int connectCities(int cities[][]) {
        boolean vis[] = new boolean[cities.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(0, 0));

        int finalCost = 0;
        ArrayList<Edge> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            Edge current = pq.remove();
            if (!vis[current.dest]) {
                vis[current.dest] = true;
                list.add(new Edge(current.dest, current.cost));
                finalCost += current.cost;
                for (int i = 0; i < cities[current.dest].length; i++) {
                    if (cities[current.dest][i] != 0) {
                        pq.add(new Edge(i, cities[current.dest][i]));
                    }

                }
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" dest = " + list.get(i).dest + " cost = " + list.get(i).cost);
        }
        return finalCost;
    }

    public static void main(String[] args) {
        int cities[][] = { { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
        System.out.println("connecting Cities With Minimum Cost = " + connectCities(cities));

    }
}
