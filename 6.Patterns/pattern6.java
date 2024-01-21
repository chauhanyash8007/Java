/*
    12345
    1234
    123      // print the  following pattern
    12
    1

 */

public class pattern6 {

    public static void inverted_half_pyramid_withNumbers(int n) {
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= n - line + 1; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid_withNumbers(5);

    }
}
