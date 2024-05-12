import java.util.*;

public class buildTreeInPreOrder1 {

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

    // 1)
    // Making of Tree
    // Time Complexity= O(n)

    static class BinaryTree {
        static int idx = -1;

        // public static Node buildTree(int nodes[]){
        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;

            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // public static void preOrderTraversal(Node root) {
        // 2)
        // Pre Order Traversal
        // Time Complexity= O(n)

        public void preOrderTraversal(Node root) {
            if (root == null) {
                // System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);

        }

        // 3)
        // In Order Traversal
        // Time Complexity= O(n)

        public void InOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            InOrderTraversal(root.left);
            System.out.print(root.data + " ");
            InOrderTraversal(root.right);
        }

        // 4)
        // Post Order Traversal
        // Time Complexity= O(n)

        public void postOrderTraversal(Node root) {
            if (root == null) {
                return;
            }

            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        // 5)
        // Level Order Traversal
        // Time Complexity= O(n)
        public void levelOrderTraversal(Node root) {
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currentNode = q.remove();
                if (currentNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currentNode.data + " ");
                    if (currentNode.left != null) {
                        q.add(currentNode.left);

                    }
                    if (currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }

            }

        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preOrderTraversal(root);
        // System.out.println();
        // tree.InOrderTraversal(root);
        // System.out.println();
        // tree.postOrderTraversal(root);
        tree.levelOrderTraversal(root);

    }
}
