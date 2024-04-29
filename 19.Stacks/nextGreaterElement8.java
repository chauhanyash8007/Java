
// Time = O(n)
import java.util.*;

public class nextGreaterElement8 {
    public static void main(String[] args) {
        int elements[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[elements.length];

        // 1) find next Greater Element in Right Side
        for (int i = elements.length - 1; i >= 0; i--) {
            // 1) step while loop
            while (!s.isEmpty() && elements[s.peek()] <= elements[i]) {
                s.pop();

            }
            // 2) step if-else condition
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = elements[s.peek()];
            }
            // 3) step push index in stack
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

        // 2) find next Greater element in Left Side
        for (int i = 0; i < elements.length; i++) {
            // 1) step while loop
            while (!s.isEmpty() && elements[s.peek()] <= elements[i]) {
                s.pop();

            }
            // 2) step if-else condition
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = elements[s.peek()];
            }
            // 3) step push index in stack
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

        // 3) find next Smaller element in Right side
        for (int i = elements.length - 1; i >= 0; i--) {
            // 1) step while loop
            while (!s.isEmpty() && elements[s.peek()] >= elements[i]) {
                s.pop();

            }
            // 2) step if-else condition
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = elements[s.peek()];
            }
            // 3) step push index in stack
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

        // 4) find next Smaller element in Left Side
        for (int i = 0; i < elements.length; i++) {
            // 1) step while loop
            while (!s.isEmpty() && elements[s.peek()] >= elements[i]) {
                s.pop();

            }
            // 2) step if-else condition
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = elements[s.peek()];
            }
            // 3) step push index in stack
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

    }
}
