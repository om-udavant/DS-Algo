package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_004_LuckyNumber {

    /*
     * Problem Code:LUCNUM
     *
     * A positive integer X is called lucky if it has an even power of 2 in its prime factorization. More formally,
     * let p be the largest integer such that X is divisible by 2p. Then X is a lucky number if and only if p is divisible by 2.
     * You are given a positive integer N. Find if it is a lucky number.
     *
     */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            long a = in.nextLong();
            int x = 0;
            while (a % 2 == 0) {
                a /= 2;
                x++;
            }

            if (x % 2 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
