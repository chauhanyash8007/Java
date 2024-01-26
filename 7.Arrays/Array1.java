// inputs output in array

import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        // int phy;
        // phy = sc.nextInt();

        System.out.println("Enter marks 1 : ");
        marks[0] = sc.nextInt();

        System.out.println("Enter marks 2 : ");
        marks[1] = sc.nextInt();

        System.out.println("Enter marks 3 : ");
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // marks[2] = 100;
        // System.out.println("math : " + marks[2]);

        // marks[2] = marks[2] - 1;
        // System.out.println(marks[2]);

        // marks[2] = marks[2] + 1;
        // System.out.println(marks[2]);

        int avg = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("avg : " + avg);

        System.out.println("length : " + marks.length);
    }
}