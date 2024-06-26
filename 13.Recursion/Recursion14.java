// Binary String Problem
// Time Complexity = O(2^n)
// Space Complexity = O(n*2^n)

public class Recursion14 {

    public static void printBinaryString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");

        }

    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");

    }
}
