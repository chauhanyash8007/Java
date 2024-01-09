// Reverse the given number

public class for8 {
    public static void main(String[] args) {
        int rev = 0;
        int n = 10899;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;

        }
        System.out.println(rev);
    }

}
