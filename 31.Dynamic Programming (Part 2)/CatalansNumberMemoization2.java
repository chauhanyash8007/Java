import java.util.Arrays;

public class CatalansNumberMemoization2 {
    public static int CatalansNumber(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[i] = CatalansNumber(i, dp) * CatalansNumber(n - i - 1, dp);

        }
        return dp[n] = ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(CatalansNumber(n, dp));

    }
}
