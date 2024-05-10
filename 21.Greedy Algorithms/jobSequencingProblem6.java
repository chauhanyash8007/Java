import java.util.*;

public class jobSequencingProblem6 {

    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // syntax for to sort objects
        // by making custom comparators
        // for low profit to high profit ascending order obj1-obj2
        // for high profit to low profit descending order obj2-obj1
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int maxProfit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job currentJob = jobs.get(i);
            if (currentJob.deadline > time) {
                seq.add(currentJob.id);
                maxProfit += currentJob.profit;
                time++;

            }

        }
        System.out.println("max job =  " + seq.size());
        System.out.println("max prob = " + maxProfit);
        for (int i = 0; i < seq.size(); i++) {
            System.out.print("job sequence = " + seq.get(i) + " ");
        }
        System.out.println();

    }
}
