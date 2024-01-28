import java.util.*;

public class extra_question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of pencil : ");
        float pencil = sc.nextFloat();

        System.out.println("Enter the value of pen : ");
        float pen = sc.nextFloat();

        System.out.println("Enter the value of book : ");
        float book = sc.nextFloat();

        float cost = pencil + pen + book;
        System.out.println("Total cost is : " + cost);

        // new cost with 18% gst

        float newCost = cost + (cost * 0.18f);
        System.out.println("NewTotal with gst is : " + newCost);
        sc.close();

    }
}
