public class subTreeOfAnotherTree4 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 11)
    // Sub Tree Od A Another Tree

    public static boolean isIdentical(Node node, Node subRoot) {
        // base Conditions
        // so Identical
        if (node == null && subRoot == null) {
            return true;
        } // Non Identical
          // 1,2
        else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        // 3
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        // 4
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;

    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {
        /*
         * --------- 1
         * -------- / \
         * -------- 2 3
         * ------ / \ / \
         * ------ 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         * -------- 2
         * ------- / \
         * ------- 4 5
         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Tree is sub Tree = " + isSubTree(root, subRoot));
    }
}
