package leetcode.easy;

import java.util.Arrays;

public class Q_824_GoatLatin {

    /*
     * You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.
     * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:
     *   -If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
     *     -For example, the word "apple" becomes "applema".
     *   -If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
     *     -For example, the word "goat" becomes "oatgma".
     *   -Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
     *     -For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
     * Return the final sentence representing the conversion from sentence to Goat Latin.
     *
     */

    public static void main(String[] args) {

    }

    static final char[] vowels = new char[10];

    static {
        vowels[0] = 'A';
        vowels[1] = 'E';
        vowels[2] = 'I';
        vowels[3] = 'O';
        vowels[4] = 'U';
        vowels[5] = 'a';
        vowels[6] = 'e';
        vowels[7] = 'i';
        vowels[8] = 'o';
        vowels[9] = 'u';
    }

    private static boolean isConsonant(char ch) {
        return Arrays.binarySearch(vowels, ch) < 0;
    }

    public String toGoatLatin(String sentence) {
        final StringBuilder sb = new StringBuilder();

        int count = 0;
        final char[] chars = sentence.toCharArray();
        final int length = chars.length;
        for (int index = 0; index < length; ) {
            if (index > 0) {
                sb.append(' ');
            }
            final char firstChar = chars[index];
            char next = firstChar;
            final boolean isConsonant = isConsonant(firstChar);
            if (isConsonant) {
                if (++index >= length) {
                    next = ' ';
                } else {
                    next = chars[index];
                }
            }
            while (next != ' ') {
                sb.append(next);
                if (++index >= length) {
                    break;
                }
                next = chars[index];
            }
            if (isConsonant) {
                sb.append(firstChar);
            }
            sb.append("ma");
            ++count;
            for (int i = 0; i < count; i++) {
                sb.append('a');
            }
            ++index;
        }

        return sb.toString();
    }

}
