// write a method named isEven that accept an int argument

import java.util.*;

public class Function14 {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter an integer : ");
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even : ");
        } else {
            System.out.println("Number is Odd : ");
        }
    }
}
