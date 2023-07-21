package leetcode.easy;

public class Q_1232_CheckIfItIsAStraightLine {

    /*
     * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
     * Check if these points make a straight line in the XY plane.
     *
     */

    public static void main(String[] args) {

    }

    public boolean checkStraightLine(int[][] coordinates) {

        int xMove = coordinates[1][0] - coordinates[0][0];
        int yMove = coordinates[1][1] - coordinates[0][1];

        for (int i = 1; i < coordinates.length; i++) {

            int x = coordinates[i][0] - coordinates[i - 1][0];
            int y = coordinates[i][1] - coordinates[i - 1][1];

            if (y * xMove != x * yMove) {
                return false;
            }

        }

        return true;

    }
}
