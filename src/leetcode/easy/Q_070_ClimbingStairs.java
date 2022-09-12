package leetcode.easy;

public class Q_070_ClimbingStairs {

    public static void main(String[] args) {

    }

    public int climbStairs(int n) {

        int a = 0;
        int b = 1;

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;

    }
}
