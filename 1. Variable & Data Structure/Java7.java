// sum and product of  a & b by user

import java.util.*;

public class Java7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println(sum);
        System.out.println(product);
        sc.close();
    }
}