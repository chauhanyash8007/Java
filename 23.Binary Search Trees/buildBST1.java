public class buildBST1 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

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

        public static void main(String[] args) {
            int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
            Node root = null;
            for (int i = 0; i < values.length; i++) {
                root = createBst(root, values[i]);
            }
            inOrder(root);
            System.out.println();
            // if (search(root, 1)) {
            // System.out.println("Found");
            // } else {
            // System.out.println("Not Found");
            // }

            root = delete(root, 1);
            System.out.println();
            inOrder(root);

        }
    }
}