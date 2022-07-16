package hackerrank.easy;

public class Q_019_DayOfTheProgrammer {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * Given a year, y, find the date of the 256th day of that year according
     * to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy,
     * where dd is the two-digit day, mm is the two-digit month, and yyyy is y.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static void main(String[] args) {

        int year = 2016;

        String result = dayOfProgrammer(year);

        System.out.println(result);
    }

    private static String dayOfProgrammer(int year) {

        String s = ".09." + Integer.toString(year);
        if (year == 1918) {
            return "26" + s;
        }
        if ((year <= 1917 && year % 4 == 0) || (year >= 1919 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
            return "12" + s;
        } else {
            return "13" + s;
        }
    }
}
