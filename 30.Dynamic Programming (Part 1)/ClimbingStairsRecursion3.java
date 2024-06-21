// Time Complexity = O(2^n)

public class ClimbingStairsRecursion3 {
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    // same as above
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 5; // n=3 -> 3 && n=4 -> 5 == Total -> 8
        System.out.println("Total ways to reach n = " + countWays(n));

    }
}
