// Time -> O(n^2)

import java.util.Arrays;

public class MatrixChainMultiplicationMemoization7 {
    public static int mcmM(int arr[], int i, int j, int dp[][]) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmM(arr, i, k, dp);
            int cost2 = mcmM(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            minCost = Math.min(minCost, cost1 + cost2 + cost3);

        }
        return dp[i][j] = minCost;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int n = arr.length;
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);

        }
        System.out.println(mcmM(arr, 1, n - 1, dp));

    }
}
