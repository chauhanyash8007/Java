// check if a number is power of 2 or not 

public class Operators10 {

    public static boolean isPowerOfTow(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTow(3));
    }
}
