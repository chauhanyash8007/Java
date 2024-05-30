
//Time Complexity : o(n)
//Space Complexity: o(n)

// 20)
// Invert Binary Tree

public class invertBinaryTree12 {
    Node root;

    void mirror() {
        root = mirror(root);
    }

    Node mirror(Node root) {
        if (root == null)
            return root;
        /* do the subtrees */
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        /* swap the left and right pointers */
        root.left = right;
        root.right = left;
        return root;
    }

    void inOrder() {
        inOrder(root);
    }

    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        // Input
        /*
         * --------- 1
         * -------- / \
         * -------- 2 3
         * ------ / \
         * ------ 4 5
         */
        // Output
        /*
         * --------- 1
         * -------- / \
         * -------- 3 2
         * --------- / \
         * --------- 5 4
         */
        invertBinaryTree12 tree = new invertBinaryTree12();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("InOrder traversal of input tree is :");
        tree.inOrder();
        System.out.println("");
        tree.mirror();
        System.out.println("InOrder traversal of binary tree is : ");
        tree.inOrder();

    }
}

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
