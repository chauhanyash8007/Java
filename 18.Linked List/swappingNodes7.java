//Time Complexity : o(n)
//Space Complexity: o(1)
//  Swapping Nodes in a LinkedList 

public class swappingNodes7 {
    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    public void swapNodes(int x, int y) {
        if (x == y)
            return;
        Node prevX = null, currentX = head;
        while (currentX != null && currentX.data != x) {
            prevX = currentX;
            currentX = currentX.next;
        }
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        if (currentX == null || currY == null)
            return;
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currentX;
        else
            head = currentX;
        Node temp = currentX.next;
        currentX.next = currY.next;
        currY.next = temp;
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        swappingNodes7 list = new swappingNodes7();
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.print("\n Linked list before ");

        list.printList();
        list.swapNodes(4, 3);
        System.out.print("\n Linked list after ");

        list.printList();

    }
}
