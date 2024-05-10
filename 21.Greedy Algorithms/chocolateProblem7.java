import java.util.*;

public class chocolateProblem7 {
    public static void main(String[] args) {
        // int n = 4, m = 6;
        Integer verticalCost[] = { 2, 1, 3, 1, 4 }; // m-1 cuts
        Integer horizontalCost[] = { 4, 1, 2 }; // n-1 cuts

        Arrays.sort(verticalCost, Collections.reverseOrder());
        Arrays.sort(horizontalCost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < horizontalCost.length && v < verticalCost.length) {
            if (verticalCost[v] < horizontalCost[h]) { // horizontal cut * vertical pieces
                cost += (horizontalCost[h]) * vp;
                hp++;
                h++;
            } else {
                // vertical cut * horizontal pieces
                cost += (verticalCost[v]) * hp;
                vp++;
                v++;
            }

        }

        // remaining cuts of horizontal and vertical

        while (h < horizontalCost.length) {
            cost += (horizontalCost[h]) * vp;
            hp++;
            h++;
        }
        while (v < verticalCost.length) {
            cost += (verticalCost[v]) * hp;
            vp++;
            v++;
        }

        System.out.println("minimum cost for cuts = " + cost);

    }
}
