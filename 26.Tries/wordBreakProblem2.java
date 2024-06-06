public class wordBreakProblem2 {
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

    // Time -> O(L) L=Largest Word Length
    public static void insert(String word) {
        Node current = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (current.children[idx] == null) {
                current.children[idx] = new Node();
            }
            current = current.children[idx];
        }
        current.endOfWord = true;
    }

    // Time -> O(L) L=Key Length
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

    // Time -> O(L) L=Largest Word Length
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            // subString (0,1)
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String array[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

        for (int i = 0; i < array.length; i++) {
            insert(array[i]);
        }
        String key = "ilikesam";
        System.out.println(wordBreak(key));

    }
}
