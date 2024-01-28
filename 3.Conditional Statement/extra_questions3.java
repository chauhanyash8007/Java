import java.util.*;

public class extra_questions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the week number(1-7) : ");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Invalid unput ! Please enter week number between 1-7.");
        }
        sc.close();

    }

}
