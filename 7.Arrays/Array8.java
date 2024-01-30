//print sub arrays

public class Array8 {

    public static void printSub(int numbers[]) {
        int array = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // print
                    System.out.print(numbers[k] + " "); // subArray
                }
                array++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total arrays are " + array);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printSub(numbers);
    }
}
