// Print number from 1 to n

import java.util.*;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener number : ");
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
