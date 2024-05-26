//Time Complexity : o(h)
//Space Complexity: o(1)

// 19)
// Check If A Binary Tree Is UniValued Or Not
// UniValued = A Binary Tree Is UniValued if every node in the tree has same value.
class checkIfUniValuedOrNot11 {
    static class Node {
        int data;
        Node left;
        Node right;
    };

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return (temp);
    }

    static boolean isUniValTree(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && root.data != root.left.data)
            return false;
        if (root.right != null && root.right.data != root.right.data)
            return false;
        return isUniValTree(root.left) && isUniValTree(root.right);

    }

    public static void main(String[] args) {
        /*
         * --------- 1
         * -------- / \
         * -------- 1 1
         * ------ / \ \
         * ------ 1 1 1
         */
        Node root = newNode(1);
        root.left = newNode(1);
        root.right = newNode(1);
        root.left.left = newNode(1);
        root.left.right = newNode(1);
        root.right.right = newNode(1);
        if (isUniValTree(root)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
