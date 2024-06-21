// Time -> O(n*sum) 

public class TargetSumSubsetTabulation9 {

    public static boolean TargetSumSubsetTabulation(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) { // 0th column because if there are items but no target=0
            dp[i][0] = true;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = arr[i - 1];
                if (v <= j && dp[i - 1][j - v] == true) { // valid + include
                    dp[i][j] = true;
                } else if (dp[i - 1][j] == true) { // exclude + valid
                    dp[i][j] = true;
                }
            }
        }
        printDp(dp);

        return dp[n][sum];

    }

    public static void printDp(boolean[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 1, 3 };
        int sum = 10;
        System.out.println(TargetSumSubsetTabulation(arr, sum));

    }
}
