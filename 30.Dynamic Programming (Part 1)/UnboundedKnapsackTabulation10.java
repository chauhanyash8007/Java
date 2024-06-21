public class UnboundedKnapsackTabulation10 {
    public static int UnboundedKnapsackTabulation(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) { // valid + max of include and exclude
                    dp[i][j] = Math.max(v + dp[i][j - w], dp[i - 1][j]); // same as 01Knapsack put i in place of i-1
                } else { // invalid + exclude
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        printDp(dp);

        return dp[n][W];
    }

    public static void printDp(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        System.out.println(UnboundedKnapsackTabulation(val, wt, w));
    }
}