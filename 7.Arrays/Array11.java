// max sub array (Kadane's Algorithm)

// time complexity = O(n)

public class Array11 {

    public static void maxSubArray(int number[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {

            currentSum = currentSum + number[i];

            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);

            // if (maxSum < currentSum) {
            // maxSum = currentSum;
            // }

        }
        System.out.println("maximum sum array is : " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        maxSubArray(number);
    }
}
