package leetcode.easy;

public class Q_482_LicenseKeyFormatting {

    /*
     *
     * You are given a license key represented as a string s that consists of only alphanumeric characters and dashes.
     * The string is separated into n + 1 groups by n dashes. You are also given an integer k.
     * We want to reformat the string s such that each group contains exactly k characters,
     * except for the first group, which could be shorter than k but still must contain at least one character.
     * Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
     * return the reformatted license key.
     *
     */

    public static void main(String[] args) {

    }

    public String licenseKeyFormatting(String s, int k) {

        s = s.toUpperCase().replace("-", "");
        int len = s.length() - 1;
        StringBuilder str = new StringBuilder();
        int i = 0;

        while (len >= 0) {

            if (i == k && len >= 0) {
                str.append('-');
                i = 0;
            }
            str.append(s.charAt(len));
            i++;


            len--;

        }

        return str.reverse().toString();
    }
}
