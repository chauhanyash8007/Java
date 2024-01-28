// Write a java program to complete the average of three numbers

import java.util.*;

public class Function13 {

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double x = sc.nextDouble();

        System.out.println("Enter the second number : ");
        double y = sc.nextDouble();

        System.out.println("Enter the third number : ");
        double z = sc.nextDouble();

        System.out.println("The average value is " + average(x, y, z) + "\n");
        sc.close();

    }

}
