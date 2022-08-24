package hackerrank.easy;

public class Q_042_RepeatedString {

    /*
     * Complete the 'repeatedString' function below.
     *
     * There is a string, s, of lowercase English letters that is repeated
     * infinitely many times. Given an integer, n, find and print the number of
     * letter a's in the first n letters of the infinite string.
     *
     * Example
     * s = 'abcac'
     * n = 10
     * The substring we consider is abcacabcac, the first 10 characters of the infinite string.
     * There are 4 occurrences of a in the substring.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static void main(String[] args) {

        String s = "aba";
        long n = 10;

        long result = repeatedString(s, n);

        System.out.println(result);
    }

    private static long repeatedString(String s, long n) {

        long count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        count = (n / s.length()) * count;

        for (int i = 0; i < (n % s.length()); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }
}
