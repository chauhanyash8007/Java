public class Matrices6 {

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;

            } else {
                col++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 40;
        staircaseSearch(matrix, key);
    }
}
