// Counting Sort

// time complexity = O(n+range) <-- linear time 

public class Sorting5 {

    public static void countingSort(int array[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < array.length; i++) { // frequency count on original array
            count[array[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < array.length; i++) { // frequency array
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }

        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
