//Time Complexity : o(n)
//Space Complexity: o(1)
// odd even LinkedList

public class oddEven8 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node current = head;
        while (end.next != null)
            end = end.next;
        Node new_end = end;
        while (current.data % 2 != 0 && current != end) {
            new_end.next = current;
            current = current.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (current.data % 2 == 0) {
            head = current;
            while (current != end) {
                if (current.data % 2 == 0) {
                    prev = current;
                    current = current.next;
                } else {
                    prev.next = current.next;
                    current.next = null;
                    new_end.next = current;
                    new_end = current;
                    current = prev.next;
                }
            }
        } else
            prev = current;
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        oddEven8 list = new oddEven8();
        list.push(11);
        list.push(10);
        list.push(8);
        list.push(6);
        list.push(4);
        list.push(2);
        list.push(0);
        System.out.println("Linked List");
        list.printList();
        list.segregateEvenOdd();
        System.out.println("updated Linked List");
        list.printList();

    }
}
