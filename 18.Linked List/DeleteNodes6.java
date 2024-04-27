//Time Complexity : o(n)
//Space Complexity: o(1)
// Delete N Nodes After M Nodes of a LinkedList

public class DeleteNodes6 {
    static class Node {
        int data;
        Node next;
    };

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    static void skipMDeleteN(Node head, int M, int N) {
        Node current = head, t;
        int count;
        while (current != null) {
            for (count = 1; count < M && current != null; count++)
                current = current.next;
            if (current == null)
                return;
            t = current.next;
            for (count = 1; count <= N && t != null; count++) {
                // Node temp = t;
                t = t.next;
            }
            current.next = t;
            current = t;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        int M = 2, N = 3;
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        System.out.printf("M = %d, N = %d \n" + "Linked list we have is :\n", M, N);

        printList(head);
        skipMDeleteN(head, M, N);
        System.out.printf("\nLinked list on deletion is :\n");
        printList(head);

    }
}
