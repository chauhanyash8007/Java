import java.util.*;

public class queueUsingTwoStacks5 {

    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // 1. add Time = O(n)
        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());

            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());

            }
        }

        // 2. remove Time = O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // 3. peek Time = O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }

    }
}
