// Selection Sort

// Time Complexity = O(n square)

public class Sorting2 {

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPosition] > array[j]) {
                    minPosition = j;
                }
            }
            // swap
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
