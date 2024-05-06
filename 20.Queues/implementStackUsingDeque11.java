import java.util.*;

public class implementStackUsingDeque11 {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // all operations Time = O(1)
        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();

        }

        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
