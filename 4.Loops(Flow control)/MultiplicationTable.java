// Write a program to print the multiple table of a number N entered by the user.

import java.util.*;

class MultiplicationTable {
    public static void printMultiplicationTable(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " =" + n * i);
        }
        sc.close();
    }

    public static void main(String s[]) {
        printMultiplicationTable(5);

    }
}
