package leetcode.easy;

public class Q_345_ReverseVowelsOfAString {

    /*
     *
     * Given a string s, reverse only all the vowels in the string and return it.
     * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
     * */

    public static void main(String[] args) {

    }

    public String reverseVowels(String s) {

        char sChar[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        boolean ex = false;

        while (start < end) {
            while (start < s.length() && !isVowel(sChar[start])) {
                start++;
            }
            while (end >= 0 && !isVowel(sChar[end])) {
                end--;
            }
            if (start < end) {
                swap(sChar, start++, end--);
            }
        }

        return new String(sChar);

    }

    void swap(char[] chars, int x, int y) {

        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }

    public boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U')
            return true;
        return false;
    }
}
