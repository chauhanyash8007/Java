import java.util.*;

public class extra_questions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("Value is positive : " + x);
        } else {
            System.out.println("Value is negative : " + x);
        }
    }
}