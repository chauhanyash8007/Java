// Time = O(n)

import java.util.*;

public class firstNonRepeatingLetters7 {

    public static void printFirstNonRepeat(String str) {
        int frequency[] = new int[26]; // 'a' to 'z'
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            frequency[ch - 'a']++;

            while (!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
                q.remove();

            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "yash";
        // String str1="aabccxb";
        printFirstNonRepeat(str);

    }
}
