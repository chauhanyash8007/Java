public class StringConversion19 {
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        // 1) initialize
        // 2) give meaning to 2D array what will be i and j values
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        // 3) start to fill
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }

            }
        }
        printDp(dp);
        return dp[n][m];

    }

    public static void printDp(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int StringConversion(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int lcsLength = lcs(str1, str2);
        int delete = n - lcsLength; // delete str1-lcs of both strings
        int insert = m - lcsLength; // insert str2-lcs
        int TotalOperation = delete + insert;
        return TotalOperation;

    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        System.out.println("Total Operation To Convert Str1 to Str2 =  " + StringConversion(str1, str2));
    }
}
