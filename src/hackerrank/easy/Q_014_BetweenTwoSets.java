package hackerrank.easy;

import java.util.ArrayList;

public class Q_014_BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */


    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(6);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(24);
        b.add(36);

        int result = getTotalX(a, b);
        System.out.println(result);
    }

    private static int getTotalX(ArrayList<Integer> a, ArrayList<Integer> b) {

        int lcm = a.get(0);
        for (Integer integer : a) {
            lcm = lcm(lcm, integer);
        }

        int gc = b.get(0);
        for (Integer integer : b) {
            gc = gcd(gc, integer);
        }

        int result = 0, multiple = 0;
        while (multiple <= gc) {
            multiple += lcm;
            if (gc % multiple == 0) {
                result++;
            }
        }
        return result;
    }

    private static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            int gcd = gcd(a, b);
            return Math.abs((a * b) / gcd);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
