// Print the factorial of a number N
// Time complexity = O(n)
// Space complexity = O(n)

public class Recursion3 {

    public static int printFactorialOfNumber(int n) {
        if (n == 0) {
            return 1;

        }
        int factOfNMinus1 = printFactorialOfNumber(n - 1);
        int factOfN = n * factOfNMinus1;
        return factOfN;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorialOfNumber(n));
    }
}
