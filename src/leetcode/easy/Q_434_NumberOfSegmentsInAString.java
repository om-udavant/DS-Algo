package leetcode.easy;

public class Q_434_NumberOfSegmentsInAString {

    /*
     * Given a string s, return the number of segments in the string.
     * A segment is defined to be a contiguous sequence of non-space characters.
     */

    public static void main(String[] args) {

    }

    public int countSegments(String s) {

        int count = 0;
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != ' ' && (s.charAt(i - 1) == ' ' || i == 0)) {
                count++;
            }

        }

        return count + 1;
    }
}
