package hackerrank.easy;

public class Q_022_DrawingBooks {

    /*
     * Complete the 'pageCount' function below.
     *
     * A teacher asks the class to open their books to a page number.
     * A student can either start turning pages from the front of the book or
     * from the back of the book. They always turn pages one at a time. When they open the book,
     * page 1 is always on the right side
     *
     * Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page p.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static void main(String[] args) {

        int n = 6;

        int p = 5;

        int result = pageCount(n, p);

        System.out.println(result);
    }

    private static int pageCount(int n, int p) {

        int df = p / 2;
        int de = n / 2;

        return Math.min(df, de - df);
    }
}
