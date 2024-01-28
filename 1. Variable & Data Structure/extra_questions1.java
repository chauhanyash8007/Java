// Average of 3 numbers

import java.util.*;

public class extra_questions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A : ");
        int A = sc.nextInt();

        System.out.println("Enter value of B : ");
        int B = sc.nextInt();

        System.out.println("Enetr value of C : ");
        int C = sc.nextInt();

        int avg = (A + B + C) / 3;
        System.out.println("Average of 3 numbers is : " + avg);
        sc.close();
    }
}