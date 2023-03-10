package leetcode.easy;

public class Q_925_LongPressedName {

    /*
     * Your friend is typing his name into a keyboard. Sometimes, when typing a character c,
     * the key might get long pressed, and the character will be typed 1 or more times.
     * You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name,
     * with some characters (possibly none) being long pressed.
     *
     */

    public static void main(String[] args) {

    }

    public boolean isLongPressedName(String name, String typed) {

        int m = name.length();
        int n = typed.length();
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (i < m && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
        }

        return i == m;

    }
}
