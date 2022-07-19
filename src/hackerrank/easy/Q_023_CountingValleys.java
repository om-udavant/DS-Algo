package hackerrank.easy;

public class Q_023_CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * A mountain is a sequence of consecutive steps above sea level,
     * starting with a step up from sea level and ending with a step down to sea level.
     *
     * A valley is a sequence of consecutive steps below sea level,
     * starting with a step down from sea level and ending with a step up to sea level.
     *
     * Given the sequence of up and down steps during a hike,
     * find and print the number of valleys walked through.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static void main(String[] args) {

        String path = "DDUDDUUDUU";

        int result = countingValleys(path.length(), path);

        System.out.println(result);

    }

    private static int countingValleys(int steps, String path) {

        int i = 0, a = 0, count = 0, temp = 0;

        while (i < steps) {
            if (path.charAt(i) == 'D') {
                a--;
            } else {
                a++;
            }

            if (a < 0) {
                temp = 1;
            }

            if (temp == 1 && a == 0) {
                count++;
                temp = 0;
            }
            i++;
        }
        return count;
    }
}
