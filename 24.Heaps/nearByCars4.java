import java.util.*;

public class nearByCars4 {

    static class Points implements Comparable<Points> {
        int x;
        int y;
        int distSquare;
        int idx;

        public Points(int x, int y, int distSquare, int idx) {
            this.x = x;
            this.y = y;
            this.distSquare = distSquare;
            this.idx = idx;
        }

        @Override
        public int compareTo(Points p2) {
            return this.distSquare - p2.distSquare; // ascending order
        }
    }

    public static void main(String[] args) {
        int points[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Points> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int distSquare = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new Points(points[i][0], points[i][1], distSquare, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.print("C" + pq.remove().idx + " ");
        }

    }
}
