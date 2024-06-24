// Time -> O(n^2)

public class MountainRangesTabulation5 {
    public static int MountainRanges(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            // i pairs -> mountain ranges -> Ci
            for (int j = 0; j <= i - 1; j++) {
                int insidePairs = dp[j];
                int outsidePairs = dp[i - j - 1];
                dp[i] += insidePairs * outsidePairs;
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
        System.out.println(MountainRanges(n));

    }
}
