//  Print x to the power n
// Time complexity = O(n)

public class Recursion9 {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int XOfNMinus1 = power(x, n - 1);
        int XOfN = x * XOfNMinus1;
        return XOfN;

        // return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));

    }
}
