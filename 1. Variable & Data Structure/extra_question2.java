// area of a square

import java.util.*;

public class extra_question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of square : ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area of a square is : " + area);
        sc.close();
    }
}
