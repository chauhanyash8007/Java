// Average case Time Complexity = O(n log n)
// Worst case  Time Complexity = O(n^2)
// Space Complexity = O(1)

public class Quick_Sort2 {
    public static void quickSort(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // last element
        int pivotIndex = partition(array, si, ei);
        quickSort(array, si, pivotIndex - 1); // left part of pivot
        quickSort(array, pivotIndex + 1, ei); // right part of pivot
    }

    public static int partition(int[] array, int si, int ei) {
        int pivot = array[ei];
        int i = si - 1; // to make place for elements smaller then pivot

        for (int j = si; j < ei; j++) {
            if (array[j] <= pivot) {
                i++;

                // then swap

                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;

            }

        }
        i++;
        int temp = pivot;
        array[ei] = array[i];
        array[i] = temp;
        return i; // pivot true index after partition
    }

    public static void main(String[] args) {
        int array[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
