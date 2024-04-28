import java.util.ArrayList;

public class StackUsingArrayList1 {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // 1. Check if empty or not
        // public static boolean isEmpty()
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // 2. PUSH Operation Time=O(1)
        // public static void push
        public void push(int data) {
            list.add(data);
        }

        // 3. POP Operation Time=O(1)
        // public static int pop()
        public int pop() {

            // stack empty condition
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // 4. PEEK Operation Time=O(1)
        // public static int peek()
        public int peek() {

            // stack empty condition
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }
}