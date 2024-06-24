// Time Complexity : o(n)
// Space Complexity: o(n)

public class TribonacciNumbersTabulation11 {
    static void printTrib(int n) {
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        for (int i = 0; i < dp.length; i++)
            System.out.print(dp[i] + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printTrib(n);

    }
}
