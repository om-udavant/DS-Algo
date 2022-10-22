package leetcode.easy;

public class Q_344_ReverseString {

    /*
     *
     *Write a function that reverses a string. The input string is given as an array of characters s.
     * You must do this by modifying the input array in-place with O(1) extra memory.
     */


    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {

        int start = 0;
        int last = s.length - 1;

        while (start < last) {

            char temp = s[start];
            s[start] = s[last];
            s[last] = temp;

            start++;
            last--;

        }


    }
}
