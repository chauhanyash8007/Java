// Time Complexity = O(2^n) Exponential

public class Zero1KnapsackRecursion6 {

    public static int knapsack(int val[], int wt[], int W, int n) { // n=5
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) { // valid to add
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // exclude
            int ans2 = knapsack(val, wt, W, n - 1);

            return Math.max(ans1, ans2);

        } else { // invalid to add
            return knapsack(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        System.out.println(knapsack(val, wt, w, val.length)); // val.length = items
    }
}
