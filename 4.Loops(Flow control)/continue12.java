
// Display all numbers entered by user except multiple of 10

import java.util.*;

public class continue12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        do {
            System.out.println("Enter your number : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);

        } while (true);

    }

}