// Time Complexity : o(n*m)
// Space Complexity: o(n*m)

public class findNumbersOfCloseFriends15 {
        static void dfs(int[][] matrix, boolean[][] visited,
                        int x, int y, int n, int m,
                        boolean hasCornerCell) {
                if (x < 0 || y < 0 || x >= n || y >= m ||
                                visited[x][y] == true || matrix[x][y] == 0)
                        return;
                if (x == 0 || y == 0 ||
                                x == n - 1 || y == m - 1) {
                        if (matrix[x][y] == 1)
                                hasCornerCell = true;
                }
                visited[x][y] = true;
                dfs(matrix, visited, x + 1, y, n, m,
                                hasCornerCell);
                dfs(matrix, visited, x, y + 1, n, m,
                                hasCornerCell);
                dfs(matrix, visited, x - 1, y, n, m,
                                hasCornerCell);
                dfs(matrix, visited, x, y - 1, n, m,
                                hasCornerCell);
        }

        static int countClosedIsland(int[][] matrix, int n,
                        int m) {
                boolean[][] visited = new boolean[n][m];
                int result = 0;
                for (int i = 0; i < n; ++i) {
                        for (int j = 0; j < m; ++j) {
                                if ((i != 0 && j != 0 &&
                                                i != n - 1 && j != m - 1) &&
                                                matrix[i][j] == 1 &&
                                                visited[i][j] == false) {
                                        boolean hasCornerCell = false;
                                        dfs(matrix, visited, i, j, n, m,
                                                        hasCornerCell);
                                        if (!hasCornerCell)
                                                result = result + 1;
                                }
                        }
                }
                return result;
        }

        public static void main(String[] args) {
                int N = 5, M = 8;
                int[][] matrix = { { 0, 0, 0, 0, 0, 0, 0, 1 },
                                { 0, 1, 1, 1, 1, 0, 0, 1 },
                                { 0, 1, 0, 1, 0, 0, 0, 1 },
                                { 0, 1, 1, 1, 1, 0, 1, 0 },
                                { 0, 0, 0, 0, 0, 0, 0, 1 } };
                System.out.print(countClosedIsland(matrix, N, M));

        }
}
