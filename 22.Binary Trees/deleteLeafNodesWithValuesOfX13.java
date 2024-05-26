//Time Complexity : o(n)
//Space Complexity: o(1)
// 21)
// Delete Leaf Nodes With Value as X

public class deleteLeafNodesWithValuesOfX13 {
    static class Node {
        int data;
        Node left, right;
    }

    static Node newNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return (newNode);
    }

    static Node deleteLeaves(Node root, int x) {
        if (root == null)
            return null;
        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);
        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        // Input
        /*
         * --------- 10
         * -------- / \
         * -------- 3 10
         * ------ / \ --\
         * ------ 3 1-- 3
         * ------------/ \
         * -----------3 3
         */
        // Output
        /*
         * --------- 10
         * -------- / \
         * -------- 3 10
         * -------- \
         * -------- 1
         */
        Node root = newNode(10);
        root.left = newNode(3);
        root.right = newNode(10);
        root.left.left = newNode(3);
        root.left.right = newNode(1);
        root.right.right = newNode(3);
        root.right.right.left = newNode(3);
        root.right.right.right = newNode(3);
        System.out.print("InOrder traversal Before deletion : ");
        inOrder(root);
        System.out.println();
        deleteLeaves(root, 3);
        System.out.print("InOrder traversal after deletion : ");
        inOrder(root);

    }
}
