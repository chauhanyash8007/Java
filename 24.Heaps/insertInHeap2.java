import java.util.*;

public class insertInHeap2 {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // 1) Insert In Heap
        // Time Complexity = O(log n)
        public void add(int data) {
            // add at last Index
            arr.add(data);

            // x=child
            int x = arr.size() - 1; // x is child index
            int parent = (x - 1) / 2; // parent index

            // while (arr.get(x) > arr.get(parent)) {
            // For MaxHeap Revers Descending Order change sign < to >
            // Code For MinHeap -> ascending Order
            while (arr.get(x) < arr.get(parent)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }

        }

        // 2) Peek From Heap -> Get Min Value in Heap
        // Time Complexity = O(1)
        public int peek() {
            return arr.get(0);
        }

        // 3) Remove from Heap
        // Time Complexity = O(log n)
        public int remove() {
            int data = arr.get(0);

            // step 1 -> swap First and Last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 -> remove Last
            arr.remove(arr.size() - 1);

            // step 3 -> HeapIfy
            HeapIfy(0);
            return data;

        }

        private void HeapIfy(int i) {
            // Code For MinHeap -> ascending Order
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIndex = i;

            // For MaxHeap Revers Descending Order change sign < to >

            if (left < arr.size() && arr.get(left) < arr.get(minIndex)) {
                minIndex = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minIndex)) {
                minIndex = right;
            }

            if (minIndex != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);

                HeapIfy(minIndex);
            }

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {

        // This is For MinHeap For MaxHeap Change sine
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
