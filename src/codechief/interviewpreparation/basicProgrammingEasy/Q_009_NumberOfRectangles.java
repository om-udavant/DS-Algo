package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_009_NumberOfRectangles {

    /*
     * Problem Code: NUMREC
     *
     */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            long n = sc.nextLong();
            long m = sc.nextLong();

            long NoRecangles = (m * n * (n + 1) * (m + 1)) / 4;
            ;

            System.out.println(NoRecangles - (n * m));

        }

    }
}
