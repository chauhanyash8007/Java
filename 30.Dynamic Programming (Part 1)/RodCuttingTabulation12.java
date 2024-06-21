public class RodCuttingTabulation12 { // variation (form) of unBounded Knapsack
    public static int RodCuttingTabulation(int price[], int length[], int rodLength) {
        int n = price.length;
        int dp[][] = new int[n + 1][rodLength + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < rodLength + 1; j++) {
                int v = price[i - 1];
                int w = length[i - 1];
                if (w <= j) { // valid + max of include and exclude
                    dp[i][j] = Math.max(v + dp[i][j - w], dp[i - 1][j]); // same as 01Knapsack put i in place of i-1
                } else { // invalid + exclude
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        printDp(dp);

        return dp[n][rodLength];
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
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 }; // value
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; // weight
        int rodLength = 8; // sack unBounded Knapsack
        System.out.println(RodCuttingTabulation(price, length, rodLength));
    }
}