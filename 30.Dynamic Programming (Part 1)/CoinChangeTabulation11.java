// Time -> O(n*sum)

public class CoinChangeTabulation11 {
    public static int CoinChangeTabulation(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];
        // i-> coins j=sum

        for (int i = 0; i < dp.length; i++) { // coins are so many but we have to give nothing so it is also
            // 1 way to give nothing
            dp[i][0] = 1;
        }
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = coins[i - 1];
                if (v <= j) { // valid + add so add all total ways include + exclude ways
                    dp[i][j] = dp[i][j - v] + dp[i - 1][j];
                } else { // exclude
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        printDp(dp);
        return dp[n][sum];
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
        int coins[] = { 2, 5, 3, 6 };
        int sum = 10;
        System.out.println(CoinChangeTabulation(coins, sum));

    }
}
