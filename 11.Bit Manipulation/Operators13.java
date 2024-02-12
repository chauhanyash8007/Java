// swap 2 variables without using 3 operator use XOR operator

public class Operators13 {
    public static void main(String[] args) {
        int x = 3, y = 4;

        System.out.println("Before swap x = " + x + " and y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap x = " + x + " and y = " + y);

    }
}
