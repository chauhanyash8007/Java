// Time Complexity = O(n log n)

public class heapSort3 {
    public static void HeapIfy(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndex = i;

        // For Revers Order change sign > to <
        if (left < size && arr[left] > arr[maxIndex]) {
            maxIndex = left;
        }

        if (right < size && arr[right] > arr[maxIndex]) {
            maxIndex = right;
        }

        if (maxIndex != i) {
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            HeapIfy(arr, maxIndex, size);
        }

    }

    public static void heapSort(int arr[]) {
        // Step 1 -> Create MaxHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            HeapIfy(arr, i, n);
        }

        // Step 2 -> push largest at the end
        for (int i = n - 1; i >= 0; i--) {
            // swap largest-first last elements
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            HeapIfy(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
