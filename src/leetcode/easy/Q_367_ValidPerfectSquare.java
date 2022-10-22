package leetcode.easy;

public class Q_367_ValidPerfectSquare {

    /*
    *
    * Given a positive integer num, write a function which returns True if num is a perfect square else False.
    * Follow up: Do not use any built-in library function such as sqrt.
    * */

    public static void main(String[] args) {

    }

    public boolean isPerfectSquare(int num) {

        if(num == 1){
            return true;
        }

        long low = 1;
        long high = num / 2;
        long mid;

        while(low <= high){

            mid = low + (high - low) / num;
            long sq = mid * mid;
            if(sq == num){
                return true;
            }else if(sq < num){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return false;

    }
}
