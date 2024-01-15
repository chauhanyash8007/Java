// write a program to compute the sum of the digit in an integer

import java.util.*;

public class Function16 {

    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            n = n / 10;
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int digits = sc.nextInt();
        System.out.println("The sum is : " + sumDigits(digits));
    }
}
