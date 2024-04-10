// Tiling Problem
// Time Complexity=O(2^n)
// Space Complexity=O(n)

public class Recursion11 {
    public static int tilingProblem(int n) { // 2 X n (Floor size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // khm
        // vertical choice
        int nMinus1 = tilingProblem(n - 1);

        // horizontal choice

        int nMinus2 = tilingProblem(n - 2);

        int totalWays = nMinus1 + nMinus2;
        return totalWays;

        // return tilingProblem(n-1)+tilingProblem(n-2);
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));

    }
}
