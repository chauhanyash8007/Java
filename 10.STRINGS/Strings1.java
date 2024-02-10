
// import java.util.*;

public class Strings1 {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char array[] = { 'a', 'b', 'c', 'd' };

        // declare String
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Strings are (IMMUTABLE) <--

        // strings input & output

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine(); for paragraph input
        // String name = sc.next(); for single word input
        // System.out.println(name);

        // String length

        // String str = "Yash c";
        // System.out.println(str.length());

        // String Concatenation (adding tow strings)

        // String firstName = "Yash";
        // String lastName = "C";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // String chat At Method
        // System.out.println(fullName.charAt(0));

        // print the String
        String str = "Yash";
        printLetters(str);

    }
}