//Time Complexity : o(n)
//Space Complexity: o(n)

public class maximumSumBSTInBinaryTree13 {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    };

    static class Info {
        int max;
        int min;
        boolean isBST;
        int sum;
        int currentMax;

        Info(int m, int mi, boolean is,
                int su, int cur) {
            max = m;
            min = mi;
            isBST = is;
            sum = su;
            currentMax = cur;
        }

        Info() {
        }
    };

    static class INT {
        int a;
    }

    static Info MaxSumBSTUtil(Node root, INT maxSum) {
        if (root == null)
            return new Info(Integer.MIN_VALUE,
                    Integer.MAX_VALUE, true, 0, 0);
        if (root.left == null && root.right == null) {
            maxSum.a = Math.max(maxSum.a, root.data);
            return new Info(root.data, root.data,
                    true, root.data, maxSum.a);
        }
        Info L = MaxSumBSTUtil(root.left, maxSum);
        Info R = MaxSumBSTUtil(root.right, maxSum);
        Info BST = new Info();
        if (L.isBST && R.isBST && L.max < root.data &&
                R.min > root.data) {
            BST.max = Math.max(root.data, Math.max(L.max, R.max));
            BST.min = Math.min(root.data, Math.min(L.min, R.min));
            maxSum.a = Math.max(maxSum.a, R.sum +
                    root.data + L.sum);
            BST.sum = R.sum + root.data +
                    L.sum;
            BST.currentMax = maxSum.a;
            BST.isBST = true;
            return BST;
        }
        BST.isBST = false;
        BST.currentMax = maxSum.a;
        BST.sum = R.sum + root.data + L.sum;
        return BST;
    }

    static int MaxSumBST(Node root) {
        INT maxSum = new INT();
        maxSum.a = Integer.MIN_VALUE;
        return MaxSumBSTUtil(root,
                maxSum).currentMax;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);
        System.out.println(MaxSumBST(root));

    }
}
