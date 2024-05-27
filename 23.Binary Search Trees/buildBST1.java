import java.util.*;

public class buildBST1 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }

    // 1)
    // Build Binary Search Tree
    // Time Complexity = O(h)
    // if ti is skewed tree then time = O(n)
    public static Node createBst(Node root, int values) {
        if (root == null) {
            root = new Node(values);
            return root;
        }
        if (root.data > values) {
            // insert node in left side
            root.left = createBst(root.left, values);
        }
        if (root.data < values) {
            // insert node in right side
            root.right = createBst(root.right, values);
        }
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

    // 2)
    // Search In Binary Search Tree
    // Time complexity = O(h)
    // h=height of Tree
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    // 3)
    // Delete A Node
    public static Node delete(Node root, int value) {
        // First For Delete We have to Search For that Node
        if (root.data < value) {
            root.right = delete(root.right, value);
        } else if (root.data > value) {
            root.left = delete(root.left, value);
        } else {
            // voila
            // case 1 - leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2 - Single Child Node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;

            }

            // Case 3 - Both Child
            Node inOrderSuccessor = findInOrderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            delete(root.right, inOrderSuccessor.data);

        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;

        }
        return root;
    }

    // 4)
    // Print In Range
    public static void printInRange(Node root, int n1, int n2) {
        if (root == null) {
            return;
        }
        if (root.data >= n1 && root.data <= n2) {
            printInRange(root.left, n1, n2);
            System.out.print(root.data + " ");
            printInRange(root.right, n1, n2);
        } else if (root.data < n1) {
            printInRange(root.left, n1, n2);
        } else {
            printInRange(root.right, n1, n2);
        }
    }

    // 5)
    // Print Root To Leaf Path
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    // 6)
    // Validate BST
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;

        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = createBst(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println();

        if (search(root, 1)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        System.out.println();

        printInRange(root, 5, 12);
        System.out.println();
        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());
        System.out.println();

        if (isValidBST(root, null, null)) {
            System.out.println("ValidBST");
        } else {
            System.out.println("InvalidBST");
        }

        root = delete(root, 1);
        System.out.println();
        inOrder(root);
        System.out.println();

    }

}