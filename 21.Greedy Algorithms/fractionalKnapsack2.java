// Tim e= O(n log n)

import java.util.*;

public class fractionalKnapsack2 {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        // Ascending order but we need descending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalValue = 0;

        // descending order
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity > weight[idx]) { // including full items
                finalValue = finalValue + value[idx];
                capacity = capacity - weight[idx];

            } else {
                // including fractional items
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;

            }

        }
        System.out.println("final value =  " + finalValue);

    }
}
