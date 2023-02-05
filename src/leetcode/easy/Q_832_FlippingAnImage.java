package leetcode.easy;

public class Q_832_FlippingAnImage {

    /*
     * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
     * To flip an image horizontally means that each row of the image is reversed.
     *   -For example, flipping [1,1,0] horizontally results in [0,1,1].
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
     *   -For example, inverting [0,1,1] results in [1,0,0].
     *
     */

    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            int a = 0, r = image[0].length - 1;
            while (a <= r) {
                int temp = image[i][a];
                image[i][a] = image[i][r];
                image[i][r] = temp;
                a++;
                r--;
            }
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
       /* for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }*/
        return image;

    }
}
