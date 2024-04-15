public class LinkedList1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    // Size of an LinkedList
    public static int size;

    // Time Complexity for this addFirst function is = O(1)
    public void addFirst(int data) {

        // 1) if there is 1 or more then 1 node exist the perform this 3 steps
        // 2) if no node exist then perform 1 step and base case only

        // step1 - create new node
        Node newNode = new Node(data);
        size++;

        // base case
        if (head == null) {
            head = tail = newNode;
            return;

        }

        // step2 - newNode next = Head
        newNode.next = head;

        // step3 - Head = newNode
        head = newNode;
    }

    // Time Complexity for this addLast function is = O(1)
    public void addLast(int data) {

        // 1) if there is 1 or more then 1 node exist the perform this 3 steps
        // 2) if no node exist then perform 1 step and base case only

        // step1 - create new node
        Node newNode = new Node(data);
        size++;

        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - tail.next=newNode
        tail.next = newNode;

        // Step 3 - tail.newNode
        tail = newNode;
    }

    // Time Complexity for this printLinkList function is = O(n)
    public void printLinkList() {

        if (head == null) {
            System.out.println("Link List is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.println(" null ");

    }

    // Time Complexity for this addInMiddle function is = O(n)
    public void addInMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;

        }

        // then loop will break then i= index-1 became so temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Link List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Link List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        // prev : i= size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;

        }
        int value = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;

    }

    // Time Complexity for this iterativeSearch function is = O(n)
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found case
                return i;
            }
            temp = temp.next;
            i++;

        }
        // key not found case
        return -1;
    }

    // Time Complexity for this recursiveSearch function is = O(n)
    public int helperRecursiveSearch(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int index = helperRecursiveSearch(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;

    }

    public int recursiveSearch(int key) {
        return helperRecursiveSearch(head, key);

    }

    // Time Complexity for this reversLinkedList function is = O(n)
    public void reversLinkedList() {
        Node prev = null;
        Node current = tail = head; // we are reversing ths linkList so head will became tail after reversing
        Node next;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Find And Remove Nth Node From End
    // Time Complexity for this deleteNthFromEnd function is = O(n)
    public void deleteNthFromEnd(int n) {
        // calculate size
        // sz=size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;

        }

        if (n == sz) {
            head = head.next; // removeFirstNode
            return;
        }

        // sz-1
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    // check if LinkList is palindrome
    // Time = O(n) ans Space = O(1)

    // slow-fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

        }

        return slow; // slow is now middle
    }

    public boolean checkPalindrome() {
        // no element and 1 Element case
        if (head == null || head.next == null) {
            return true;
        }
        // Step 1: find mid
        Node midNode = findMid(head);

        // Step 2: revers 2nd half
        Node prev = null;
        Node current = midNode;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        // right half head prev will became right half head after revers
        Node right = prev;
        Node left = head;

        // Step 3: check left half with right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addInMiddle(2, 3);
        // ll.printLinkList();
        // System.out.println(ll.size); this one is true
        // System.out.println(LinkedList1.size); // but we can also write this way too
        // print size
        // ll.removeFirst();
        // ll.printLinkList();
        // ll.removeLast();
        // ll.printLinkList();
        // System.out.println(ll.iterativeSearch(3));
        // System.out.println(ll.iterativeSearch(7));
        // System.out.println(ll.recursiveSearch(3));
        // System.out.println(ll.recursiveSearch(5));
        // ll.printLinkList();
        // ll.reversLinkedList();
        // ll.printLinkList();
        // ll.deleteNthFromEnd(3);
        // ll.printLinkList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.printLinkList();
        System.out.println(ll.checkPalindrome());

    }
}