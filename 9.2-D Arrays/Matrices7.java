// counting the 7 element how many times it repeat in array

public class Matrices7 {
    public static void main(String[] args) {
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    sum++;
                }
            }
        }
        System.out.println("count of 7 is :" + sum);
    }
}
