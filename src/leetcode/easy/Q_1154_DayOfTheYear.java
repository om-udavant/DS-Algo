package leetcode.easy;

public class Q_1154_DayOfTheYear {

    /*
     * Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.
     *
     */

    public static void main(String[] args) {

    }

    public int dayOfYear(String date) {

        String[] s = date.split("-");

        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);

        boolean isLeap = checkYear(year);
        int noOfDays = 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month - 1; i++) {
            if (isLeap && i == 1) {
                noOfDays += days[i] + 1;
                continue;
            }
            noOfDays += days[i];
        }

        return noOfDays + day;

    }

    boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }
}
