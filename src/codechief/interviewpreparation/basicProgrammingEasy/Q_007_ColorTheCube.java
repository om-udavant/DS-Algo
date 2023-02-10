package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_007_ColorTheCube {

    /*
     *
     * Problem Code: COLOR8TEST
     *
     */

    public static void main(String[] args) throws java.lang.Exception {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            long n = in.nextLong();
            long x1 = in.nextLong();
            long x2 = in.nextLong();
            long x3 = in.nextLong();
            long x4 = in.nextLong();
            long x5 = in.nextLong();
            long x6 = in.nextLong();

            long sum = (x1 + x2 + x3 + x4 + x5 + x6);
            if (n % 2 == 0) {
                System.out.println(sum * (n / 2));
            } else {
                System.out.println(sum * ((n + 1) / 2));
            }
        }

    }

}
