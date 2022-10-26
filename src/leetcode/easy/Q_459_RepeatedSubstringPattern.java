package leetcode.easy;

public class Q_459_RepeatedSubstringPattern {

    /*
     * Given a string s, check if it can be constructed by taking a substring of it
     * and appending multiple copies of the substring together.
     */

    public static void main(String[] args) {

    }

    public boolean repeatedSubstringPattern(String s) {

        int len = s.length();

        for (int i = len / 2; i >= 1; i--) {

            if (len % i == 0) {
                int rep = len / i;
                String str = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < rep; j++) {
                    sb.append(str);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;

    }
}
