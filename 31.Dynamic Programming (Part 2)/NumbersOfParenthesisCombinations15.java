
public class NumbersOfParenthesisCombinations15 {

    private static int ans = 0;

    public static int helper(int left, int right) {
        if (left == 0 && right == 0) {
            ans++;
        }
        if (left > right) {
            return 0;
        }
        if (left > 0) {
            helper(left - 1, right);
        }
        if (right > 0) {
            helper(left, right - 1);
        }
        return ans;
    }

    // Find possible ways for balanced parentheses
    private static int countWays(int n) {
        // If n is odd no possible valid parentheses
        if ((n & 1) != 0)
            return 0;
        return helper(n / 2, n / 2);
    }

    public static void main(String[] args) {
        int n = 4; // Example: Finding valid parentheses sequences of length 6
        int ways = countWays(n);
        System.out.println("Number of ways to arrange parentheses for n = " + n + ": " + ways);
    }

}
