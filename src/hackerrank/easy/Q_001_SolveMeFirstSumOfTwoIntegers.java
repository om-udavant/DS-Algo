package hackerrank.easy;

import java.util.Scanner;

//Complete the function solveMeFirst to compute the sum of two integers.
//        has the following parameters:
//
//        int a: the first value
//        int b: the second value
//        Returns
//        - int: the sum of a and b

public class Q_001_SolveMeFirstSumOfTwoIntegers {
    static int solveMeFirst(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter the 1st Integer ");
        a = in.nextInt();
        int b;
        System.out.println("Enter the 2st Integer ");
        b = in.nextInt();
        int sum;
        System.out.println("Addition of the Two Integers is ");
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
