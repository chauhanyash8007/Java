//Time Complexity : o(n*n)
//Space Complexity: o(n*n)
// 22)
// Find All Duplicate SubTrees

import java.util.*;

public class findAllDuplicateSubTrees14 {
    static HashMap<String, Integer> m;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static String inOrder(Node root) {
        if (root == null)
            return "";
        String str = "(";
        str += inOrder(root.left);
        str += Integer.toString(root.data);
        str += inOrder(root.right);
        str += ")";
        if (m.get(str) != null && m.get(str) == 1)
            System.out.print(root.data + " ");
        if (m.containsKey(str))
            m.put(str, m.get(str) + 1);
        else
            m.put(str, 1);
        return str;
    }

    static void printAllDuplicate(Node root) {
        m = new HashMap<>();
        inOrder(root);
    }

    public static void main(String[] args) {
        /*
         * --------- 1
         * -------- / \
         * -------- 2 3
         * ------ / \ / \
         * ------ 4 5 2 4
         * ----------/
         * ----------4
         */
        Node root = null;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);
        printAllDuplicate(root);

    }
}
