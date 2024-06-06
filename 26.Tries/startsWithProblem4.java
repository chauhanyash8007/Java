public class startsWithProblem4 {
    static class Node {
        Node children[] = new Node[26];
        boolean endOfWord = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (current.children[idx] == null) {
                current.children[idx] = new Node();
            }
            current = current.children[idx];
        }
        current.endOfWord = true;
    }

    public static boolean search(String key) {
        Node current = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (current.children[idx] == null) {
                return false;
            }
            current = current.children[idx];
        }
        return current.endOfWord == true;
    }

    // Time -> O(L) L=Length Of PreFix
    public static boolean startWith(String preFix) {
        Node current = root;
        for (int i = 0; i < preFix.length(); i++) {
            int idx = preFix.charAt(i) - 'a';
            if (current.children[idx] == null) {
                return false;
            }
            current = current.children[idx];
        }
        return true;

    }

    public static void main(String[] args) {
        String words[] = { "apple", "app", "mango", "man", "women" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String preFix1 = "app";
        String preFix2 = "moon";
        System.out.println(startWith(preFix1));
        System.out.println(startWith(preFix2));

    }
}
