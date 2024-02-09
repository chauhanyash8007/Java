// spiral matrix

public class Matrices3 {

    public static void printSpiral(int matrix[][]) {
        int startsRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startsRow <= endRow && startCol <= endCol) {
            // top side
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startsRow][j] + " ");
            }

            // right side
            for (int i = startsRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom side
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startsRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left side
            for (int i = endRow - 1; i >= startsRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startsRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        printSpiral(matrix);
    }
}
