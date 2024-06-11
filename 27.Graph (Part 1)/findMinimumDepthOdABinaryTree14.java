// Time Complexity : o(n)
// Space Complexity: o(1)

import java.util.*;

public class findMinimumDepthOdABinaryTree14 {
    static class Node {
        int data;
        Node left, right;
    }

    static class qItem {
        Node node;
        int depth;

        public qItem(Node node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    static int minDepth(Node root) {
        if (root == null)
            return 0;
        Queue<qItem> q = new LinkedList<>();
        qItem qi = new qItem(root, 1);
        q.add(qi);
        while (q.isEmpty() == false) {
            qi = q.peek();
            q.remove();
            Node node = qi.node;
            int depth = qi.depth;
            if (node.left == null && node.right == null)
                return depth;
            if (node.left != null) {
                qi.node = node.left;
                qi.depth = depth + 1;
                q.add(qi);
            }
            if (node.right != null) {
                qi.node = node.right;
                qi.depth = depth + 1;

                q.add(qi);
            }
        }
        return 0;
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        System.out.println(minDepth(root));

    }
}
