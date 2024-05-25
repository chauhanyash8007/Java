import java.util.*;

public class topViewOfATree5 {
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

    // 12)
    // Top View of Tree
    // Time Complexity = O(n)
    static class Info {
        Node node;
        int horizontalDistance;

        public Info(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }

    public static void topView(Node root) {
        // 1) LevelOrder Traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info current = q.remove();
            if (current == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(current.horizontalDistance)) {
                    // means first time so we can add in map Table
                    map.put(current.horizontalDistance, current.node);
                }
                if (current.node.left != null) {
                    q.add(new Info(current.node.left, current.horizontalDistance - 1));
                    min = Math.min(min, current.horizontalDistance - 1);
                }
                if (current.node.right != null) {
                    q.add(new Info(current.node.right, current.horizontalDistance + 1));
                    max = Math.max(max, current.horizontalDistance + 1);
                }

            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
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
        topView(root);

    }
}
