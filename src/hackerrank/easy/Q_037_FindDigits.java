package hackerrank.easy;

public class Q_037_FindDigits {

    /*
     * Complete the 'findDigits' function below.
     *
     * An integer d is a divisor of an integer n if the remainder of n/d = 0.
     * Given an integer, for each digit that makes up the integer determine whether it is a divisor.
     * Count the number of divisors occurring within the integer.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static void main(String[] args){

        int n = 124;

        int result = findDigits(n);

        System.out.println(result);
    }

    private static int findDigits(int n) {

        int temp = n;
        int count = 0;

        while(temp != 0){
            int rem = temp % 10;
            if(rem != 0 && n % rem == 0){
                count++;
            }
            temp = temp / 10;
        }

        return count;
    }
}
