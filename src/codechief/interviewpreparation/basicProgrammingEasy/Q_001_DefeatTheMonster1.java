package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_001_DefeatTheMonster1 {

    /*
     * Problem Code:MONSTER1
     *
     * A monster has H health points. Each time you hit it with a sword it loses X health points.
     * However, the monster always gains Y health points right before every one of your hits.
     * The monster is considered defeated when the number of health points it has becomes zero or less than zero.
     * You need to find if it is possible to defeat the monster.
     */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            long h = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();

            if (x > y) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }
}
