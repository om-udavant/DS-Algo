package hackerrank.easy;

public class Q_046_TaumAndBday {

    /*
     * Complete the 'taumBday' function below.
     *
     * Taum is planning to celebrate the birthday of his friend, Diksha.
     * There are two types of gifts that Diksha wants from Taum: one is black and
     * the other is white. To make her happy, Taum has to buy b black gifts and w white gifts.
     *   The cost of each black gift is bc units.
     *   The cost of every white gift is wc units.
     *   The cost to convert a black gift into white gift or vice versa is z units.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */

    public static void main(String[] args) {

        int b = 3;
        int w = 3;
        int bc = 1;
        int wc = 9;
        int z = 2;

        long result = taumBday(b, w, bc, wc, z);
        System.out.println(result);
    }

    private static long taumBday(int b, int w, int bc, int wc, int z) {

        return (long) b * Math.min(bc, wc + z) + (long) w * Math.min(wc, bc + z);

    }
}
