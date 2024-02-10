// print the transpose matrix of given matrix

public class Matrices9 {

    public static void printMatrix(int matrix[][]) {
        System.out.println("the given matrix is  ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 7 },
                { 5, 6, 7 } };

        int row = 2, col = 3;
        // display original matrix
        printMatrix(matrix);

        int transpose[][] = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // print transpose Matrix
        printMatrix(transpose);

    }
}
