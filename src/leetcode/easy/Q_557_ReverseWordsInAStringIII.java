package leetcode.easy;

public class Q_557_ReverseWordsInAStringIII {

    /*
     * Given a string s, reverse the order of characters in each word within a sentence while still
     * preserving whitespace and initial word order.
     *
     */

    public static void main(String[] args) {

    }

    public String reverseWords(String s) {

        int lastIndex = -1;
        char[] arr = s.toCharArray();

        for (int i = 0; i <= s.length(); i++) {

            if (i == s.length() || arr[i] == ' ') {

                int start = lastIndex + 1;
                int end = i - 1;
                while (start < end) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
                lastIndex = i;
            }
        }

        return new String(arr);

    }
}
