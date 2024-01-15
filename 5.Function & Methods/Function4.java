// product of a & b using function

import java.util.*;

public class Function4 {

    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of a : ");
        int b = sc.nextInt();
        int prod = calculateProduct(a, b);
        System.out.println("a * b =" + prod);
        prod = calculateProduct(2, 50);
        System.out.println(prod);
    }
}
