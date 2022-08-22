package hackerrank.easy;

public class Q_038_AppendAndDelete {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * You have two strings of lowercase English letters.
     * You can perform two types of operations on the first string:
     * 1. Append a lowercase English letter to the end of the string.
     * 2. Delete the last character of the string. Performing this
     *    operation on an empty string results in an empty string.
     *
     * Given an integer, k, and two strings, s and t, determine
     * whether or not you can convert s to t by performing exactly k
     * of the above operations on s. If it's possible, print Yes. Otherwise,
     * print No.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */


    public static void main(String[] args) {

        String s = "hackerhappy";
        String t = "hackerrank";
        int k = 9;

        String result = appendAndDelete(s, t, k);

        System.out.println(result);
    }

    private static String appendAndDelete(String s, String t, int k) {

        int si = 0;
        int ti = 0;

        if (k >= s.length() + t.length()) {
            return "Yes";
        }

        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
                ti++;
            } else {
                break;
            }
        }

        int restOp = s.length() - si + t.length() - ti;

        if (k < restOp) {
            return "No";
        }
        if ((k - restOp) % 2 == 0) {
            return "Yes";
        }

        return "No";
    }
}
