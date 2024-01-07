// print the largest of 3 number

import java.util.*;

public class else_if6 {
    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        int C = 6;

        if (A >= B && A >= C) {
            System.out.println("A is largest");
        } else if (B >= C) {
            System.out.println("B is Largest");

        } else {
            System.out.println("C is Largest");
        }
    }

}
