public class circularQueueUsingArray2 {
    static class Queue {
        static int array[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            array = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // 1. Queue empty Operation
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // 2. Queue is Full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // 3.Add operation Time = O(1)
        public void add(int data) {
            // Queue is already full condition
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // adding 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            array[rear] = data;
        }

        // 4. Remove operations Time = O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = array[front];
            // if we are deleting the last element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // 5. Peek Operations Time = O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.print(q.remove() + " ");
        q.add(4);
        System.out.print(q.remove() + " ");
        q.add(5);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();

        }

    }
}
