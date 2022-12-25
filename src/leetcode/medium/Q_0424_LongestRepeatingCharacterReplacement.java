package leetcode.medium;

public class Q_0424_LongestRepeatingCharacterReplacement {

    /*
     * You are given a string s and an integer k. You can choose any character of the string and change it to any other
     * uppercase English character. You can perform this operation at most k times.
     * Return the length of the longest substring containing the same letter you can get after performing the above operations.
     *
     */

    public static void main(String[] args) {

    }

    public int characterReplacement(String s, int k) {

        int n = s.length();
        int[] charCount = new int[26];

        int windowStart = 0;
        int maxLength = 0;
        int maxCount = 0;

        for (int windowEnd = 0; windowEnd < n; windowEnd++) {

            charCount[s.charAt(windowEnd) - 'A']++;
            int currentCharCount = charCount[s.charAt(windowEnd) - 'A'];
            maxCount = Math.max(maxCount, currentCharCount);

            while (windowEnd - windowStart - maxCount + 1 > k) {
                charCount[s.charAt(windowStart) - 'A']--;
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }

        return maxLength;

    }

}
