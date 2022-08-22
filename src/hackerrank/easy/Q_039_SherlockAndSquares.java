package hackerrank.easy;

public class Q_039_SherlockAndSquares {

    /*
     * Complete the 'squares' function below.
     *
     * Watson likes to challenge Sherlock's math ability.
     * He will provide a starting and ending value that describe a range of
     * integers, inclusive of the endpoints. Sherlock must determine the
     * number of square integers within that range.
     *Note: A square integer is an integer which is the square of an integer
     *
     * Example:
     * a = 24
     * b = 49
     *
     * There are three square integers in the range: 25, 36 and 49. Return 3.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static void main(String[] args) {

        int a = 24;
        int b = 49;

        int result = squares(a, b);
        System.out.println(result);
    }

    private static int squares(int a, int b) {

        /*  It will the error of Time Exceeded
        int count = 0;

        for(int i = a; i <= b; i++){
            for(int j = 1; j*j <= i; j++){
                if(j*j == i){
                    count++;
                }
            }
        }
        return count;
        */

        int i = (int) (Math.ceil(Math.sqrt(a)));
        int j = (int) (Math.floor(Math.sqrt(b)));

        return j - i + 1;
    }
}
