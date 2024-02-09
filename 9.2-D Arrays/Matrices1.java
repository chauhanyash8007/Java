import java.util.*;

public class Matrices1 {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Founded at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.err.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        // int n=3 , m=3;
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        // for input element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // for output print element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
        sc.close();

    }
}