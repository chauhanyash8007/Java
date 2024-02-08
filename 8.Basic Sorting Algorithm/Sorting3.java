// insertion Sort

// Time Complexity = O(n square)

public class Sorting3 {

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prev = i - 1;

            // finding out the correct position to insert
            while (prev >= 0 && array[prev] > current) {
                array[prev + 1] = array[prev];
                prev--;
            }
            // insertion
            array[prev + 1] = current;
        }
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };

        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
