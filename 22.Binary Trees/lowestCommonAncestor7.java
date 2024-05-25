import java.util.*;

public class lowestCommonAncestor7 {
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

    // 14)
    // Lowest Common Ancestor
    // Time Complexity= o(n)
    // Space Complexity= o(n)
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean leftFound = getPath(root.left, n, path);
        boolean rightFound = getPath(root.right, n, path);

        if (leftFound || rightFound) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        // last common ancestor
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }

        }

        // last common node -> i-1th
        Node lca = path1.get(i - 1);
        return lca;

    }

    // 15)
    // Lowest Common Ancestor
    // Method -2
    // Time Complexity = O(n)
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        // right=null left=valid
        if (rightLca == null) {
            return leftLca;
        }
        // left=null right=valid
        if (leftLca == null) {
            return rightLca;
        }
        // both side valid
        return root;

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

        int n1 = 4, n2 = 7;
        System.out.println("lca 1 = " + lca(root, n1, n2).data);
        System.out.println("lca 2 = " + lca2(root, n1, n2).data);

    }
}
