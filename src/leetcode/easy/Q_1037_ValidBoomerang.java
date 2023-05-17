package leetcode.easy;

public class Q_1037_ValidBoomerang {

    /*
     * Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.
     * A boomerang is a set of three points that are all distinct and not in a straight line.
     *
     */

    public static void main(String[] args) {

    }

    public boolean isBoomerang(int[][] points) {

        return !((points[0][0] - points[1][0]) * (points[0][1] - points[2][1]) == (points[0][0] - points[2][0]) * (points[0][1] - points[1][1]));

    }
}
