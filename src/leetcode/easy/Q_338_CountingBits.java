package leetcode.easy;

public class Q_338_CountingBits {

    /*
     *
     * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
     * ans[i] is the number of 1's in the binary representation of i.
     * */

    public static void main(String[] args) {

    }

    public int[] countBits(int n) {

        int[] ans = new int[n + 1];
        ans[0] = 0;

        for (int i = 1; i <= n; i++) {
            ans[i] = Integer.bitCount(i);
        }

        return ans;

        /*
        int[] ans = new int[n + 1];
        ans[0] = 0;

        if(n == 0){
            return ans;
        }

        for(int i = 1; i <= n; i++){

            if(i%2 == 0){

                ans[i] = ans[i / 2];

            }else{

                ans[i] = ans[i / 2] + 1;

            }

        }

        return ans;
        */
    }
}
