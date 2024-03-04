// convert numbers into words

public class Recursion16 {

    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigitInToWord(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigitInToWord(number / 10);
        System.out.print(digit[lastDigit] + " ");
    }

    public static void main(String[] args) {
        printDigitInToWord(1234);

    }
}
