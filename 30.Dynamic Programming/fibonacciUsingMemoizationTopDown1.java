// Time Complexity = O(n)

public class fibonacciUsingMemoizationTopDown1 {
    public static int fibMemoization(int n, int DP[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (DP[n] != 0) { // if already calculated ---> it is called Memoization
            return DP[n];
        }
        DP[n] = fibMemoization(n - 1, DP) + fibMemoization(n - 2, DP);
        return DP[n];

    }

    public static void main(String[] args) {
        int n = 5;
        int DP[] = new int[n + 1]; // size = n+1 -> 0 To n
        System.out.println(fibMemoization(n, DP));
    }
}