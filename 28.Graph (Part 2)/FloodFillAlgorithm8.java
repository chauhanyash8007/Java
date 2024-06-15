// Time -> O(m*n)

public class FloodFillAlgorithm8 {

    public void helper(int image[][], int sr, int sc, int color, boolean vis[][], int orgColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc]
                || image[sr][sc] != orgColor) {
            return;
        }
        // Mark the current pixel as visited
        vis[sr][sc] = true;

        // Change the color of the current pixel
        image[sr][sc] = color;

        // Recursive calls to adjacent pixels
        // left
        helper(image, sr, sc - 1, color, vis, orgColor);
        // right
        helper(image, sr, sc + 1, color, vis, orgColor);
        // up
        helper(image, sr - 1, sc, color, vis, orgColor);
        // down
        helper(image, sr + 1, sc, color, vis, orgColor);

    }

    public int[][] floodFill(int image[][], int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        int image[][] = { { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 } };

        int sr = 1;
        int sc = 1;
        int newColor = 2;

        FloodFillAlgorithm8 solution = new FloodFillAlgorithm8();
        int[][] result = solution.floodFill(image, sr, sc, newColor);

        // Print the modified image after flood fill
        System.out.println("Modified Image:");
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}

// class Solution {
// public void helper(int image[][], int sr, int sc, int color, boolean vis[][],
// int orgColor) {
// if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length ||
// vis[sr][sc]
// || image[sr][sc] != orgColor) {
// return;
// }
// vis[sr][sc] = true;

// image[sr][sc] = color;

// helper(image, sr, sc - 1, color, vis, orgColor);
// helper(image, sr, sc + 1, color, vis, orgColor);
// helper(image, sr - 1, sc, color, vis, orgColor);
// helper(image, sr + 1, sc, color, vis, orgColor);

// }

// public int[][] floodFill(int[][] image, int sr, int sc, int color) {
// boolean vis[][] = new boolean[image.length][image[0].length];
// helper(image, sr, sc, color, vis, image[sr][sc]);
// return image;

// }

// public static void main(String[] args) {
// int image[][] = { { 1, 1, 1 },
// { 1, 1, 0 },
// { 1, 0, 1 } };
// int sr = 1;
// int sc = 1;
// int color = 2;

// Solution solution = new Solution();
// int[][] result = solution.floodFill(image, sr, sc, color);

// for (int[] row : result) {
// for (int pixel : row) {
// System.out.print(pixel + " ");
// }
// System.out.println();
// }
// }

// }
