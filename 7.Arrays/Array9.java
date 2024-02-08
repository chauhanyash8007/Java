//print Maximum sub arrays

//time complexity = O(n^3)

public class Array9 {

    public static void printSub(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) { // print
                    // subArray sum
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }

        }
        System.out.println("maximum sum is : " + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };

        printSub(numbers);
    }
}
