public class doublyLinkedList3 {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // 1. addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 2. addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 3. print
    public void print() {
        if (head == null) {
            System.out.println("doubly linkedList is empty");
            return;
        }
        System.out.print(" null ");
        System.out.print(" <--> ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;

        }
        System.out.println(" null");

    }

    // 4. removeFirst
    public int removeFirst() {
        if (size == 0) {
            System.out.println("doubly linkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;

        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    // 5. removeLast
    public int removeLast() {
        if (size == 0) {
            System.out.println("doubly linkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;

        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = tail.data;
        prev.next = null;
        tail.prev = prev;
        tail = prev;
        size--;
        return value;

    }

    // 6. revers doubly linked lists
    public void reversDoublyLinkedList() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;

        }
        head = prev;
    }

    public static void main(String[] args) {
        doublyLinkedList3 dll = new doublyLinkedList3();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(6);
        dll.print();
        dll.reversDoublyLinkedList();

        dll.print();
        System.out.println(doublyLinkedList3.size);
    }
}
