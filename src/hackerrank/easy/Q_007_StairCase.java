package hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_007_StairCase {
    /*
     * Complete the 'staircase' function below.
     *
     * This is a staircase of size n : 4
     *
     *      #
     *     ##
     *    ###
     *   ####
     *   Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
     *
     *  Write a program that prints a staircase of size n.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {


        for(int i = 1 ; i <= n; i++){
            for(int k = n; k > i;k--){
                System.out.print(" ");
            }
            for(int j = 0; j < i ; j++){
                System.out.print("#");
            }

            System.out.print("\n");

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of stairs ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }
}
