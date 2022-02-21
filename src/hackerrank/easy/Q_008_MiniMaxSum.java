package hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_008_MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     *Given five positive integers, find the minimum and maximum values that can be calculated
     * by summing exactly four of the five integers. Then print the respective minimum and maximum
     * values as a single line of two space-separated long integers.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many elements do you want to insert ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int element;
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Enter the " + (i + 1) + " Element ");
            element = Integer.parseInt(bufferedReader.readLine());
            arr.add(element);
        }

        miniMaxSum(arr);

        bufferedReader.close();
    }

    static void miniMaxSum(List<Integer> arr) {

        long min = 0, max = 0, sum = 0;
        min = max = arr.get(0);
        for (int i = 0; i < arr.size(); i++){
            sum += arr.get(i);

            if(arr.get(i) > max){
                max = arr.get(i);
            }
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        System.out.println("\nMinimum is " + (sum - max) + "\nMaximum is " + (sum - min));
    }
}
