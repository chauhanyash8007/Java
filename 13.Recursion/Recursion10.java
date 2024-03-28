//  Optimized
//  Print x to the power n
//  Time complexity = O(log n)

public class Recursion10 {

    public static int optimizedPower(int a, int n) {

        if (n == 0) {
            return 1;
        }

        // if power is even

        // int HalfPowerSquare = optimizedPower(a, n / 2) * optimizedPower(a, n / 2); //
        // Here for this power
        // Function 2 Time And Space Complexity is O(n) ok

        int halfPower = optimizedPower(a, n / 2);
        int HalfPowerSquare = halfPower * halfPower;

        // if power is odd

        if (n % 2 != 0) {
            HalfPowerSquare = a * HalfPowerSquare;

        }

        return HalfPowerSquare;
    }

    public static void main(String[] args) {
        int a = 2, n = 10;
        System.out.println(optimizedPower(a, n));

    }
}
