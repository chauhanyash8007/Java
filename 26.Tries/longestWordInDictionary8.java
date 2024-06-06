public class longestWordInDictionary8 {
    static class Node {
        char data;
        String word;
        boolean isEnd;
        Node[] children;

        public Node(char data) {
            this.data = data;
            this.word = null;
            this.isEnd = false;
            this.children = new Node[26];
        }
    }

    private Node root = new Node('/');
    private String ans = "";

    private void insert(String word) {
        Node current = this.root;
        for (int i = 0; i < word.length(); i++) {
            int childIdx = word.charAt(i) - 'a';
            if (current.children[childIdx] == null) {
                current.children[childIdx] = new Node(word.charAt(i));
            }
            current = current.children[childIdx];
        }
        current.isEnd = true;
        current.word = word;
    }

    private void dfs(Node node) {
        if (node == null) {
            return;
        }
        if (node.word != null) {
            if (node.word.length() > ans.length()) {
                ans = node.word;
            } else if (node.word.length() == ans.length() &&
                    node.word.compareTo(ans) < 0) {
                ans = node.word;
            }
        }
        for (Node child : node.children) {
            if (child != null && child.word != null) {
                dfs(child);
            }
        }
    }

    public String longestWord(String[] words) {
        for (String word : words) {
            insert(word);
        }
        Node current = this.root;
        dfs(current);
        return ans;
    }

    public static void main(String[] args) {
        longestWordInDictionary8 solution = new longestWordInDictionary8();
        String words[] = { "w", "wo", "wor", "worl", "world" };
        String result = solution.longestWord(words);
        System.out.println(result);

    }
}