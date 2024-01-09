
// Print sum of first n natural number

import java.util.*;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;

        }
        System.out.print("sum is : " + sum);

    }
}
