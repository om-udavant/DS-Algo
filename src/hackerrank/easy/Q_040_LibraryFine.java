package hackerrank.easy;

public class Q_040_LibraryFine {

    /*
     * Complete the 'libraryFine' function below.
     *
     * Your local library needs your help! Given the expected and actual return dates
     * for a library book, create a program that calculates the fine (if any).
     * The fee structure is as follows:
     *
     * 1. If the book is returned on or before the expected return date, no fine will be charged.
     * 2. If the book is returned after the expected return day but still within the same calendar
     *    month and year as the expected return date, fine = 15 Hackons * (number of days late).
     * 3. If the book is returned after the expected return month but still within the same
     *    calendar year as the expected return date, the fine = 500 Hackons * (number of days late).
     * 4. If the book is returned after the calendar year in which it was expected, there is a
     *    fixed fine of 10000 Hackons.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */

    public static void main(String[] args) {

        int d1 = 6, m1 = 6, y1 = 2015;
        int d2 = 9, m2 = 6, y2 = 2015;

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        System.out.println(result);
    }

    private static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        if (y1 > y2) {
            return 10000;
        } else if (m1 > m2 && y1 == y2) {
            return Math.abs(m1 - m2) * 500;
        } else if (d1 > d2 && m1 == m2 && y1 == y2) {
            return Math.abs(d1 - d2) * 15;
        }

        return 0;
    }
}
