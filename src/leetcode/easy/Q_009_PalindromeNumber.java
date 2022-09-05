package leetcode.easy;

public class Q_009_PalindromeNumber {

    /*
    * Given an integer x, return true if x is palindrome integer.
    * An integer is a palindrome when it reads the same backward as forward.
    * For example, 121 is a palindrome while 123 is not.
    * */

    public static void main(String[] args){

    }

    public boolean isPalindrome(int x) {

        int sum = 0;
        int y = x;

        while(y > 0){
            int rem = y % 10;
            sum = (sum * 10) + rem;
            y = y / 10;
        }

        return (sum == x);

    }
}
