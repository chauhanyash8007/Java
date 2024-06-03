import java.util.*;

public class HashMapImplementation3 {
    static class HashMap<K, V> { // generic

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n
        private int N; // N
        private LinkedList<Node> buckets[]; // N = bucket.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % N;
        }

        private int searchInLinkedList(K key, int bucketIndex) {
            LinkedList<Node> ll = buckets[bucketIndex];
            int dataIndex = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return dataIndex;
                }
                dataIndex++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        public void reHash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add To bucket old bucket To bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove(i);
                    put(node.key, node.value);
                }
            }
        }

        // 1) Put Function
        // O(lambda) -> O(1)
        public void put(K key, V value) {
            int bucketIndex = hashFunction(key); // 0 To 3
            int dataIndex = searchInLinkedList(key, bucketIndex); // if already exists then return valid
            // else return -1 or invalid

            if (dataIndex != -1) {
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            } else {
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }

            double lambda = n / N;
            if (lambda > 2.0) {
                reHash();
            }

        }

        // 2) is ContainKey Function
        // Time -> o(1)
        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            // if already exists then return true
            if (dataIndex != -1) {
                return true;

            }
            // else return false
            else {
                return false;

            }
        }

        // 3) Remove Function
        // Time -> O(1)
        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);

            if (dataIndex != -1) {
                Node node = buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            } else {
                return null;

            }
        }

        // 4) Get Function
        // Time -> O(1)
        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);

            if (dataIndex != -1) {
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            } else {
                return null;

            }
        }

        // 5) KeySet Function
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);

                }
            }
            return keys;
        }

        // 6) isEmpty Function
        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Nepal", 5);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
