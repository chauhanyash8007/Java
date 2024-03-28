// Print Nth fibonacci numbers
// Time complexity = O(n)
// Main Worst Case Time complexity = O(2^n) This one is true not upper one
// Space complexity = O(n)

public class Recursion5 {

    public static int printFibonacciNumbers(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibOfNMinus1 = printFibonacciNumbers(n - 1);
        int fibOfNMinus2 = printFibonacciNumbers(n - 2);
        int fibOfN = fibOfNMinus1 + fibOfNMinus2;
        return fibOfN;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(printFibonacciNumbers(n));
    }
}
