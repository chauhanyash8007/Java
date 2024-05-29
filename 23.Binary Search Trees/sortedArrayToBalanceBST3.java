public class sortedArrayToBalanceBST3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;

        }
    }

    // 8)
    // Sorted Array To Balance BST
    // Time Complexity = O(n)

    public static Node createBalanceBST(int array[], int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(array[mid]);
        root.left = createBalanceBST(array, start, mid - 1);
        root.right = createBalanceBST(array, mid + 1, end);
        return root;

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        /*
         * --------- 8
         * -------- / \
         * -------- 5 11
         * ------ / \ / \
         * ----- 3 6 10 12
         * 
         * expected BST
         */

        int array[] = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = createBalanceBST(array, 0, array.length - 1);
        inOrder(root);
        System.out.println();
        preOrder(root);

    }
}
