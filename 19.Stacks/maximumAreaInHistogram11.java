// Time = O(n)

import java.util.*;

public class maximumAreaInHistogram11 {

    public static void maxArea(int array[]) {
        int maxArea = 0;
        int nextSmallerRight[] = new int[array.length];
        int nextSmallerLeft[] = new int[array.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = array.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                nextSmallerRight[i] = array.length;
            } else {
                nextSmallerRight[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = s.peek();
            }
            s.push(i);
        }

        // current Area : width = j-i-1 = nsr[i]-nsl[i]-1
        for (int i = 0; i < array.length; i++) {
            int height = array[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max(currentArea, maxArea);

        }
        System.out.println(" max area in histogram: " + maxArea);

    }

    public static void main(String[] args) {
        // heights of histograms
        int array[] = { 2, 1, 5, 6, 2, 3 };
        maxArea(array);

    }
}