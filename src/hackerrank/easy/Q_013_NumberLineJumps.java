package hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_013_NumberLineJumps {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     *
     * The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
     * The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
     * You have to figure out a way to get both kangaroos at the same location at the same time
     * as part of the show. If it is possible, return YES, otherwise return NO.
     *
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the postion of first kangaroo ");
        int x1 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("No of steps jumped by first kangaroo");
        int v1 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter the postion of second kangaroo ");
        int x2 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("No of steps jumped by second kangaroo");
        int v2 = Integer.parseInt(bufferedReader.readLine());

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

        bufferedReader.close();
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {

        if(x1 < x2){
            if(v1 <= v2){
                return "NO";
            }
            else{
                while(x1 <= x2){
                    if(x1 == x2){
                        return "YES";
                    }

                    x1 = x1 + v1;
                    x2 = x2 + v2;
                }

                return "NO";
            }
        }
        else{
            if(v2 <= v1){
                return "NO";
            }
            else{
                while(x2 <= x1){
                    if(x1 == x2){
                        return "YES";
                    }

                    x1 = x1 + v1;
                    x2 = x2 + v2;
                }

                return "NO";
            }
        }
    }
}
