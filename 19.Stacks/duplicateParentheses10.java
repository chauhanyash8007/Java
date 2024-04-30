// Time = O(n)

import java.util.*;

public class duplicateParentheses10 {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing bracket condition
            if (ch == ')') {
                int count = 0;
                // opening pair
                while (s.pop() != '(') { // stack will never be empty because string is valid
                    count++;

                }
                if (count < 1) {
                    return true; // duplicate
                }
            } else {
                // opening bracket condition
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // valid String
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));

    }
}
