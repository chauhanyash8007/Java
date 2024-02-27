// Print the sum of First N natural number
// Time complexity = O(n^2) exponential
// Space complexity = O(n)

public class Recursion4 {

    public static int printSumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        int sumOfNMinus1 = printSumOfNaturalNumbers(n - 1);
        int sumOfN = n + sumOfNMinus1;
        return sumOfN;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printSumOfNaturalNumbers(n));
    }
}
