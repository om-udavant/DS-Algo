package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_003_ThreeNumberExpression {

    /*
     * Problem Code:EXPRESSION_3
     *
     * You are given T testcases , in each testcase you are given three numbers A, B and C .
     * Find that whether an expression of the form "xAyBzC" exists ( where x ,y and z can be + or −) ,
     * such that the final result is 0.If it exists print "YES" (without quotes), else print "NO"(without quotes).
     *
     */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();

            if (a + b == c) {
                System.out.println("YES");
            } else if (a + c == b) {
                System.out.println("YES");
            } else if (b + c == a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
