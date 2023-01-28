package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Arrays;
import java.util.Scanner;

public class Q_0002_AttackOnKingdom {

    /*
     * Problem Code:KNGATK
     *
     * Nightking wants to attack the kingdom and he really likes cold days.
     * However, he doesn’t want to attack the kingdom on the coldest day, because it is obvious.
     * Instead, he will attack the second coldest day. Given an array A of N distinct integers where
     * Ai represents the temperature forecast of the i-th day, You need to find the temperature of the day of the attack.
     *
     */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int s = in.nextInt();
            int[] arr = new int[s];

            for (int j = 0; j < s; j++) {
                arr[j] = in.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(arr[1]);

        }
    }
}
