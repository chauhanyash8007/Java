// Time Complexity : o(r*c)
// Space Complexity: o(r*c)

public class findSizeOfLargestAreaInBooleanMatrix16 {
    static int ROW, COL, count;

    static boolean isSafe(int[][] M, int row, int col,
            boolean[][] visited) {
        return ((row >= 0) && (row < ROW) && (col >= 0)
                && (col < COL)
                && (M[row][col] == 1 && !visited[row][col]));
    }

    static void DFS(int[][] M, int row, int col,
            boolean[][] visited) {
        int[] rowNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] colNbr = { -1, 0, 1, -1, 1, -1, 0, 1 };
        visited[row][col] = true;
        for (int k = 0; k < 8; k++) {
            if (isSafe(M, row + rowNbr[k], col + colNbr[k],
                    visited)) {
                count++;
                DFS(M, row + rowNbr[k], col + colNbr[k],
                        visited);
            }
        }
    }

    static int largestRegion(int[][] M) {
        boolean[][] visited = new boolean[ROW][COL];
        int result = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (M[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    DFS(M, i, j, visited);
                    result = Math.max(result, count);
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int M[][] = { { 0, 0, 1, 1, 0 },
                { 0, 0, 1, 1, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1 } };
        ROW = 4;
        COL = 5;
        System.out.println(largestRegion(M));

    }
}
