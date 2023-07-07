package leetcode.easy;

public class Q_1071_GreatestCommonDivisorOfStrings {

    /*
     * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
     * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
     *
     */

    public static void main(String[] args) {

    }

    public String gcdOfStrings(String str1, String str2) {

        String bigger = str1.length() > str2.length() ? str1 : str2;
        String smaller = str1.length() > str2.length() ? str2 : str1;

        if(bigger.equals(smaller)){
            return smaller;
        }

        if(!bigger.startsWith(smaller)){
            return "";
        }

        return gcdOfStrings(bigger.substring(smaller.length()), smaller);

    }
}
