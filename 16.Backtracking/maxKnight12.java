// Time Complexity=O(n^2*2^(n^2))
// Space Complexity=O(n^2)

public class maxKnight12 {

    public static boolean isSafe(char board[][], int row, int col) {
        int n = board.length;
        int i, j;
        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K') {
            return false;
        }
        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') {
            return false;
        }
        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K') {
            return false;
        }
        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K') {
            return false;
        }

        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K') {
            return false;
        }
        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K') {
            return false;
        }

        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') {
            return false;
        }
        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < n && j > +0 && board[i][j] == 'K') {
            return false;
        }
        return true;

    }

    static int number = 4;

    public static void nKnights(char board[][], int row, int col, int num) {
        int n = board.length;
        if (row == n) {
            if (num == number) {
                printBoard(board);
                count++;

            }
            maxKnights = Math.max(maxKnights, num);

            return;
        } else if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col != n - 1) {
                nKnights(board, row, col + 1, num + 1);

            } else {
                nKnights(board, row + 1, 0, num + 1);

            }
            board[row][col] = 'X'; // backtracking
        }
        if (col != n - 1) {
            nKnights(board, row, col + 1, num);

        } else {
            nKnights(board, row + 1, 0, num);

        }

    }

    public static void printBoard(char board[][]) {
        System.out.println("--------Chess Board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    static int maxKnights = -1;

    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nKnights(board, 0, 0, 0);
        System.out.println("Total ways to solve nKnight is : " + count);
        System.out.println("maxKnights are : " + maxKnights);
    }
}
