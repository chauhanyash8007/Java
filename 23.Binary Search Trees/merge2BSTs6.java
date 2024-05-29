import java.util.*;

public class merge2BSTs6 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;

        }
    }

    // 11)
    // Merge 2 BSTs
    // Time = O(n+m) linear time

    public static void getInOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInOrder(root.left, arr);
        arr.add(root.data);
        getInOrder(root.right, arr);

    }

    public static Node createBST(ArrayList<Integer> finalArr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(finalArr.get(mid));
        root.left = createBST(finalArr, start, mid - 1);
        root.right = createBST(finalArr, mid + 1, end);
        return root;

    }

    public static Node mergeBSTs(Node root1, Node root2) {

        // step 1 -> InOrder For BST1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOrder(root1, arr1);

        // step 2 -> InOrder For BST2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOrder(root2, arr2);

        // step 3 -> merge BST1 and BST2
        ArrayList<Integer> finalArr = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;

            }

        }

        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;

        }
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // step 4 create Merge BST
        return createBST(finalArr, 0, finalArr.size() - 1);

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        /*
         * --------- 2
         * -------- / \
         * --------1 - 4
         * Given BST1
         */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         * --------- 9
         * -------- / \
         * --------3 - 12
         * Given BST2
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
         * ---------- 3
         * -------- / -\
         * --------1 -- 9
         * ------- \ - / \
         * ------- 2 - 4 12
         * Expected BST
         */

        Node root = mergeBSTs(root1, root2);
        preOrder(root);

    }
}
