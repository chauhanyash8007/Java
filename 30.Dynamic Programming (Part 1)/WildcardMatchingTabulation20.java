// Time -> O(n*m)

public class WildcardMatchingTabulation20 {
    public static boolean WildcardMatching(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n + 1][m + 1];

        // initialize

        // s="" p="" -> same so match -> true
        dp[0][0] = true;

        // s="anything" p ="" -> no match -> false
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }

        // s="" then check of pattern
        // p.charAt(j-1) == '?' || p.charAt(j -1) == 'any char' -> false by default
        // store
        for (int j = 1; j < m + 1; j++) {
            if (p.charAt(j - 1) == '*') { // match with * then check for j-1 pattern
                dp[0][j] = dp[0][j - 1]; // case true -> true || case false -> false will be store
                // or in other cases by default store false
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // case 1) ith char == jth char || jth char == ?
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                    // case 2)
                } else if (p.charAt(j - 1) == '*') { // '*' -> 2 case
                    // dp[i-1][j] -> match s=i-1 decrease p = j same
                    // dp[i][j-1] -> match with empty or ignored s=i same p=j-1
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }

            }
        }
        printDp(dp);
        return dp[n][m];
    }

    public static void printDp(boolean dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****ba*****ab";
        if (WildcardMatching(s, p)) {
            System.out.println("Matching is possible");
        } else {
            System.out.println("Matching is not possible");
        }

    }

}
