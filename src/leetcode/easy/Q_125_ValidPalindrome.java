package leetcode.easy;

public class Q_125_ValidPalindrome {

    /*
     *
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
     * removing all non-alphanumeric characters, it reads the same forward and backward.
     * Alphanumeric characters include letters and numbers.Given a string s,
     * return true if it is a palindrome, or false otherwise.
     *
     * */

    public boolean isPalindrome(String s) {
        /*
        String fixed = "";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixed += c;
            }
        }

        fixed = fixed.toLowerCase();

        int start = 0;
        int end = fixed.length() - 1;

        while(start <= end){
            if(fixed.charAt(start) != fixed.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
        */

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;

        }

        return true;

    }
}
