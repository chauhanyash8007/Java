/*
    1
    12         // print the  following pattern
    123
    1234
 */

public class pattern3 {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}