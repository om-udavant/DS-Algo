package leetcode.easy;

public class Q_812_LargestTriangleArea {

    /*
     * Given an array of points on the X-Y plane points where points[i] = [xi, yi],
     * return the area of the largest triangle that can be formed by any three different points.
     * Answers within 10-5 of the actual answer will be accepted.
     *
     */

    public static void main(String[] args) {

    }

    public double largestTriangleArea(int[][] points) {

        double max = 0.0;

        if (points.length < 3) {
            return max;
        }

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double area = getArea(points[i], points[j], points[k]);
                    if (area > max) {
                        max = area;
                    }
                }
            }
        }

        return max;

    }

    public double getArea(int[] p1, int[] p2, int[] p3) {
        return Math.abs(p1[0] * (p2[1] - p3[1]) + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1])) / 2.0;
    }
}
