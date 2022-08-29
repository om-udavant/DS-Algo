package hackerrank.medium;

import java.math.BigInteger;

public class Q_003_ExtraLongFactorials {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void main(String[] args) {
        int n = 25;

        extraLongFactorials(n);
    }

    private static void extraLongFactorials(int n) {
        BigInteger bigInteger = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }

        System.out.println(bigInteger);
    }
}
