// write a program that reads set of integer and then print the sum of the even and odd integers

import java.util.*;

public class extra_questions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number : ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("Do ypu want to continue? Press 1 for yes or 0 for no");

            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("sum of even number is : " + evenSum);
        System.out.println("sum of odd number is : " + oddSum);
        sc.close();
    }
}
