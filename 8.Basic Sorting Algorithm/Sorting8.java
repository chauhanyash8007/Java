public class Sorting8 {

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prev = i - 1;

            while (prev >= 0 && array[prev] < current) {
                array[prev + 1] = array[prev];
                prev--;
            }

            array[prev + 1] = current;
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
