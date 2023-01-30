package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_005_PixelDamage {

    /*
     * Problem Code: PIXDAM
     *
     * You are given a rectangle with dimensionsH×W, where H and W are positive integers representing the vertical and
     * horizontal dimensions of the rectangle respectively. You are also given a point P which is at distance X
     * from the rectangle's left edge and at distance Y from the rectangle's top edge.
     * Find whether the distance from the point P to the bottom right corner of the rectangle is strictly less than K.
     */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            long h = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long k = in.nextLong();

            double cal = Math.sqrt(((w - x) * (w - x)) + ((h - y) * (h - y)));

            if (cal < k) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}
