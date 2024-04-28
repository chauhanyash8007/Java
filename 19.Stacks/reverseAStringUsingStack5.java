// Time = O(n)

import java.util.*;

public class reverseAStringUsingStack5 {

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;

        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char current = s.pop();
            result.append(current);

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("current string: " + str);
        System.out.println("reverse string: " + reverseString(str));

    }
}
