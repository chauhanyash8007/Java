public class prefixProblem3 {

    static class Node {
        Node children[] = new Node[26];
        boolean endOfWord = false;
        int frequency;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            frequency = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node current = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (current.children[idx] == null) {
                current.children[idx] = new Node();
            } else {
                current.children[idx].frequency++;
            }
            current = current.children[idx];
        }
        current.endOfWord = true;
    }

    // Time -> O(L) L=Longest Word In Trie
    public static void findPrefix(Node root, String ans) {
        if (root == null) {
            return;
        }
        if (root.frequency == 1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String array[] = { "zebra", "dog", "duck", "dove" };

        for (int i = 0; i < array.length; i++) {
            insert(array[i]);
        }
        root.frequency = -1;

        findPrefix(root, "");
    }
}
