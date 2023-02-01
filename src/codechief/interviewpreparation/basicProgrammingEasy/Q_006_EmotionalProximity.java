package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_006_EmotionalProximity {

    /*
     * Problem Code:EMPR
     *
     * You are given T testcases , each testcase consists of 3 numbers , P, X, Y, Z.
     * You have a best friend named Rahul.Z is 1 if you will meet Rahul and 0 otherwise. You initially has an Emotional Proximity of P,
     * which increases by Y% if you meet Rahul and decreases by X% otherwise. You have to print the final Emotional Proximity.
     *
     */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            double p = in.nextDouble();
            double x = in.nextDouble();
            double y = in.nextDouble();
            double z = in.nextDouble();

            if (z == 1) {
                System.out.println(p + (y * p / 100));
            } else if (z == 0) {
                System.out.println(p - (x * p / 100));
            }


        }
    }
}
