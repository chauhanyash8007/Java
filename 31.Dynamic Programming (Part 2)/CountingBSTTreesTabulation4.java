// Time -> O(n^2)

public class CountingBSTTreesTabulation4 {
    public static int CountingBST(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            // ci -> Bst (i nodes) -> dp[i]
            for (int j = 0; j <= i - 1; j++) {
                int leftSubTree = dp[j];
                int rightSubTree = dp[i - j - 1];
                dp[i] += leftSubTree * rightSubTree;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(CountingBST(n));

    }

}
