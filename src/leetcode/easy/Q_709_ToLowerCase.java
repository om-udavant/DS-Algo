package leetcode.easy;

public class Q_709_ToLowerCase {

    /*
     * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
     *
     */

    public static void main(String[] args) {

    }

    public String toLowerCase(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                ans += (char) ((int) c + 32);
            } else {
                ans += c;
            }
        }

        return ans;

    }
}
