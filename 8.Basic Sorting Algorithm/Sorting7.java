public class Sorting7 {

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[minPosition] < array[j]) {
                    minPosition = j;
                }

            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
