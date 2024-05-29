import java.util.*;

public class convertBST2BalancedBST4 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;

        }
    }

    // 9)
    // Convert BST To Balance BST
    // Time Complexity = O(n)
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInOrder(Node root, ArrayList<Integer> inOrder) {
        if (root == null) {
            return;
        }
        getInOrder(root.left, inOrder);
        inOrder.add(root.data);
        getInOrder(root.right, inOrder);
    }

    public static Node createBST(ArrayList<Integer> inOrder, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(inOrder.get(mid));
        root.left = createBST(inOrder, start, mid - 1);
        root.right = createBST(inOrder, mid + 1, end);
        return root;

    }

    public static Node balanceBST(Node root) {

        // 1) calculate InOrder Sequence -> o(n)
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root, inOrder);

        // 2) sorted InOrder -> Balance BST -> o(n)
        root = createBST(inOrder, 0, inOrder.size() - 1);
        return root;

    }

    public static void main(String[] args) {
        /*
         * --------- 8
         * -------- / \
         * --------6 10
         * ------ /- - \
         * ----- 5- - 11
         * -----/ - - -\
         * ----3 - - - 12
         * 
         * Given BST
         */

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /*
         * --------- 8
         * -------- / \
         * -------- 5 11
         * ------ / \ / \
         * ----- 3 6 10 12
         * 
         * expected BST
         */

        root = balanceBST(root);
        preOrder(root);

    }
}
