// sum of 2 value using function with Parameters

import java.util.*;

public class Function2 {

    public static int calculateSum(int num1, int num2) { // num1 & num2 are called parameters or formal parameters

        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println("sum is : " + sum);
        sc.close();

    }
}
