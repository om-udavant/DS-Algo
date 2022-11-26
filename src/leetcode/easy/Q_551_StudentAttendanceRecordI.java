package leetcode.easy;

public class Q_551_StudentAttendanceRecordI {

    /*
     * You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:
     *  -'A': Absent.
     *  -'L': Late.'
     *  -'P': Present.
     * The student is eligible for an attendance award if they meet both of the following criteria:
     *  -The student was absent ('A') for strictly fewer than 2 days total.
     *  -The student was never late ('L') for 3 or more consecutive days.
     * Return true if the student is eligible for an attendance award, or false otherwise.
     *
     */

    public static void main(String[] args) {

    }

    public boolean checkRecord(String s) {

        int a = 0;
        int l = 0;
        int p = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                a++;
                if (l < 3) {
                    l = 0;
                }
            } else if (c == 'L') {
                l++;
            } else if (l < 3) {
                l = 0;
            }

        }

        if (a >= 2 || l >= 3) {
            return false;
        }
        return true;

    }
}
