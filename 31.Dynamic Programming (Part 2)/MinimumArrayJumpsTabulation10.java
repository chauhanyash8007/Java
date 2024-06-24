import java.util.Arrays;

public class MinimumArrayJumpsTabulation10 {
    public static int MinimumArrayJumps(int numbers[]) {
        int n = numbers.length;
        int dp[] = new int[n];

        Arrays.fill(dp, -1);
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int steps = numbers[i];
            int ans = Integer.MAX_VALUE;
            for (int j = i + 1; j <= i + steps && j < n; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }
            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        return dp[0];

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 1, 1, 4 };
        System.out.println("Steps to reach src(0) To Dest(n-1) = " + MinimumArrayJumps(numbers));

    }
}
