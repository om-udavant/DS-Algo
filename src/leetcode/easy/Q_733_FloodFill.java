package leetcode.easy;

public class Q_733_FloodFill {

    /*
     * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
     * You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from
     * the pixel image[sr][sc].
     * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel
     * of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color),
     * and so on. Replace the color of all of the aforementioned pixels with color.
     * Return the modified image after performing the flood fill.
     *
     */

    public static void main(String[] args) {

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (image[sr][sc] == newColor) {
            return image;
        }

        fill(image, sr, sc, image[sr][sc], newColor);

        return image;

    }

    public void fill(int[][] image, int sr, int sc, int color, int newColor) {

        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) {
            return;
        }

        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, color, newColor);
        fill(image, sr + 1, sc, color, newColor);
        fill(image, sr, sc - 1, color, newColor);
        fill(image, sr, sc + 1, color, newColor);

    }
}
