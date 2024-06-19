// Time Complexity = O(n*w) n=value w=capacity or size of 2D array

public class Zero1KnapsackTabulation8 {
    public static int knapsackTabulation(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) { // 0th col i=row j=column
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // 0th col i=row j=column
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1]; // ith item value
                int w = wt[i - 1]; // ith item wt
                if (w <= j) { // valid
                    // include
                    int includeProfit = v + dp[i - 1][j - w];

                    // exclude
                    int excludeProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(includeProfit, excludeProfit);

                } else { // inValid

                    // exclude
                    int excludeProfit = dp[i - 1][j];
                    dp[i][j] = excludeProfit;

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
        System.out.println(knapsackTabulation(val, wt, w));

    }
}
