package leetcode.easy;

public class Q_917_ReverseOnlyLetters {

    /*
     * Given a string s, reverse the string according to the following rules:
     * All the characters that are not English letters remain in the same position.
     * All the English letters (lowercase or uppercase) should be reversed.
     * Return s after reversing it.
     *
     */

    public static void main(String[] args) {

    }

    public String reverseOnlyLetters(String s) {
        int start = 0;
        int last = s.length() - 1;

        char[] ch = s.toCharArray();

        while (start < last) {
            while (start < last && !Character.isAlphabetic(ch[start])) {
                start++;
            }
            while (start < last && !Character.isAlphabetic(ch[last])) {
                last--;
            }

            char temp = ch[start];
            ch[start] = ch[last];
            ch[last] = temp;

            start++;
            last--;
        }

        return new String(ch);
    }
}
