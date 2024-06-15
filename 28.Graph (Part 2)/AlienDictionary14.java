// Time Complexity : o(v+e)
// Space Complexity: o(v+e)

import java.util.*;

class AlienDictionary {
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> map = new HashMap<>();
        Map<Character, Integer> degree = new HashMap<>();
        String result = "";
        if (words == null || words.length == 0) {
            return result;
        }
        for (String s : words) {
            for (char c : s.toCharArray()) {
                degree.put(c, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String current = words[i];
            String next = words[i + 1];
            int min = Math.min(current.length(), next.length());
            for (int j = 0; j < min; j++) {
                char c1 = current.charAt(j);
                char c2 = next.charAt(j);
                if (c1 != c2) {
                    Set<Character> set = map.getOrDefault(c1, new HashSet<>());
                    if (!set.contains(c2)) {
                        set.add(c2);
                        map.put(c1, set);
                        degree.put(c2, degree.get(c2) + 1); // update c2, c1 < c2
                    }
                    break;
                }
            }
        }
        LinkedList<Character> q = new LinkedList<>();
        for (char c : degree.keySet()) {
            if (degree.get(c) == 0) {
                q.add(c);
            }
        }
        while (!q.isEmpty()) {
            char c = q.poll();
            result += c;
            if (map.containsKey(c)) {
                for (char next : map.get(c)) {
                    degree.put(next, degree.get(next) - 1);
                    if (degree.get(next) == 0) {
                        q.offer(next);
                    }
                }
            }
        }
        return result.length() == degree.size() ? result : "";
    }

    public static void main(String[] args) {
        AlienDictionary alienDictionary = new AlienDictionary();

        // Example 1
        String[] words1 = { "wrt", "wrf", "er", "ett", "rftt" };
        String result1 = alienDictionary.alienOrder(words1);
        System.out.println("Alien order for words1: " + result1);

        // Example 2
        String[] words2 = { "z", "x" };
        String result2 = alienDictionary.alienOrder(words2);
        System.out.println("Alien order for words2: " + result2);

        // Example 3
        String[] words3 = { "z", "x", "z" };
        String result3 = alienDictionary.alienOrder(words3);
        System.out.println("Alien order for words3: " + result3);

        // Example 4
        // int N = 3, k = 3;
        String dict[] = { "caa", "aaa", "aab" };
        String result4 = alienDictionary.alienOrder(dict);
        System.out.println("Alien order for words3: " + result4);

    }
}
