// Time Complexity = O(n*w) n=value w=capacity or size of 2D array

public class Zero1KnapsackMemoization7 {
    public static int knapsackMemoization(int val[], int wt[], int W, int n, int dp[][]) { // n=5
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) { // already calculated
            return dp[n][W];
        }

        if (wt[n - 1] <= W) { // valid to add
            // include
            int ans1 = val[n - 1] + knapsackMemoization(val, wt, W - wt[n - 1], n - 1, dp);

            // exclude
            int ans2 = knapsackMemoization(val, wt, W, n - 1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];

        } else { // invalid to add
            dp[n][W] = knapsackMemoization(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        int dp[][] = new int[val.length + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsackMemoization(val, wt, w, val.length, dp)); // val.length = items

    }
}
