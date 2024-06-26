// Time -> O(n^2)

public class CatalansNumberTabulation3 {
    public static int CatalansNumber(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        printDP(dp);
        return dp[n];
    }

    public static void printDP(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(CatalansNumber(n));
    }
}
