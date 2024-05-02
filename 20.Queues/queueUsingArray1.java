public class queueUsingArray1 {
    static class Queue {
        static int array[];
        static int size;
        static int rear;

        Queue(int n) {
            array = new int[n];
            size = n;
            rear = -1;
        }

        // 1. Queue empty Operation
        public boolean isEmpty() {
            return rear == -1;
        }

        // 2.Add operation Time = O(1)
        public void add(int data) {
            // Queue is already full condition
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            array[rear] = data;
        }

        // 3. Remove operations Time = O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = array[0];
            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];

            }
            rear = rear - 1;
            return front;
        }

        // 4. Peek Operations Time = O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();

        }

    }
}