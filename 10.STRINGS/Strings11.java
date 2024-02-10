//  count How many times  lowercase vowels occurred in a Strings entered by the user

import java.util.*;

public class Strings11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("count of total vowels : " + count);
        sc.close();

    }
}
