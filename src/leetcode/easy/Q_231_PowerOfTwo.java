package leetcode.easy;

public class Q_231_PowerOfTwo {

    /*
     *
     * Given an integer n, return true if it is a power of two. Otherwise, return false.
     * An integer n is a power of two, if there exists an integer x such that n == 2x.
     *
     * */

    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {


        if (n == 1) {
            return true;
        }

        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);

        /*
        if(n == 1){
            return true;
        }
        if(n % 2 != 0){
            return false;
        }

        while(n > 2){
            n = n / 2;
            if(n % 2 != 0){
                return false;
            }
        }

        return n / 2 == 1;
        */

    }
}
