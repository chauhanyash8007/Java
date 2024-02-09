public class Matrices8 {
    public static void main(String[] args) {
        int numbers[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        int sum = 0;

        // sum of 2 row element
        for (int j = 0; j < numbers[0].length; j++) {
            sum = sum + numbers[1][j];
        }

        System.out.println("sum is : " + sum);
    }
}
