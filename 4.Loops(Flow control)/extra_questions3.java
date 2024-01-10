// write a program to find a factorial of a given number

import java.util.*;

public class practice_questions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int fact = 1;
        System.out.println(" Enter any positive integer :  ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;

        }
        System.out.println("Factorial : " + fact);
    }
}
