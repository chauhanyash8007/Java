// Time = O(n) if end array is given sorted
// Time = O(n log n) if end array is not given sorted

import java.util.*;

public class ActivitySelection1 {

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };

        // end time is already given sorted
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // ----------------------------------------------------------
        // for sorting end time column
        // for not given end time sorted
        // we will calculate
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortForm
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // ----------------------------------------------------------

        int maxActivity = 0;

        ArrayList<Integer> answer = new ArrayList<>();
        maxActivity = 1;

        // answer.add(0)
        answer.add(activities[0][0]);

        // int lastEnd= end[0]
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            // if( start[i]) >=
            if (activities[i][1] >= lastEnd) {
                maxActivity++;

                // answer.add(i);
                answer.add(activities[i][0]);

                // lastEnd = end[i];
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activity = " + maxActivity);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print("A" + answer.get(i) + " ");
        }
        System.out.println();

    }
}