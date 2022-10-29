package leetcode.easy;

public class Q_504_Base7 {

    /*
     * Given an integer num, return a string of its base 7 representation.
     *
     */

    public static void main(String[] args) {

    }

    public String convertToBase7(int num) {

        int count = 0;
        int res = 0;

        while(num != 0){
            int dig = num % 7;
            res += dig *Math.pow(10, count);
            count++;
            num /= 7;
        }

        return Integer.toString(res);

    }
}
