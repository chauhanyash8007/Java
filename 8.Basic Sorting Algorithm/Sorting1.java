// Bubble Sort

// Worst Case Time Complexity = O(n^2)
// Best Case Time Complexity = O(n^2)
// only for this solution

public class Sorting1 {

    public static void bubbleSort(int array[]) {
        for (int turn = 0; turn < array.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] > array[j + 1]) {
                    // swap

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println("total swaps are : " + swap);
        }

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        bubbleSort(array);

        printArray(array);

        // for (int i = 0; i < array.length; i++) {
        // System.out.print(array[i] + " ");
        // }
    }
}