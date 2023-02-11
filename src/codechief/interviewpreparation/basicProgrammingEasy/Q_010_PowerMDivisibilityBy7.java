package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_010_PowerMDivisibilityBy7 {

    /*
     * Problem Code: PMD7
     *
     */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long x = sc.nextLong();
            int m = sc.nextInt();
            long res = 0;
            while (x > 0) {
                long rem = x % 10;
                long pow = m % 4;

                if (pow == 0 && m != 0) {
                    pow = 4;
                }

                rem = (long) Math.pow(rem, pow) % 10;
                res = (res * 10) + rem;
                x /= 10;

            }

            System.out.println(res % 7 == 0 ? "YES" : "NO");
        }
    }

}
