
public class diameterOfATree3 {
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

    // 9)
    // Method-1
    // Diameter Of A Tree
    // Tim complexity = O(n^2)
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter2(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter2(root.left);
        int leftHeight = height(root.left);

        int rightDiameter = diameter2(root.right);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));

    }

    // 10)
    // Method-2
    // Diameter of A Tree
    // Time Complexity= O(n)

    static class Information {
        int diameter;
        int height;

        public Information(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }

    }

    public static Information diameter(Node root) {
        if (root == null) {
            return new Information(0, 0);
        }
        Information leftInfo = diameter(root.left);
        Information rightInfo = diameter(root.right);

        int diameter = Math.max(leftInfo.height + rightInfo.height + 1,
                Math.max(leftInfo.diameter, rightInfo.diameter));
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Information(diameter, height);
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

        System.out.println("Method 1 = " + diameter2(root));

        System.out.println("Method 2 = " + diameter(root).diameter);
        System.out.println("Method 2 = " + diameter(root).height);
        // This will return information object
        // so we need to return Object of Diameter

    }
}
