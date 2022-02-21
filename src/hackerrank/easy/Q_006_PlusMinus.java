package hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_006_PlusMinus {

    /*
     *Given an array of integers, calculate the ratios of its elements that are positive,
     *negative, and zero. Print the decimal value of each fraction on a new line with
     * places after the decimal.
     *
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        float positive = 0, negative = 0, zeros = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) < 0){
                negative = negative + 1;
            }else if(arr.get(i) > 0){
                positive = positive + 1;
            }else{
                zeros = zeros + 1;
            }
        }

        System.out.println("Ratio of positive number is " + positive / arr.size());
        System.out.println("Ratio of negative number is " + negative / arr.size());
        System.out.println("Ratio of zeros is " + zeros / arr.size());

    }

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
         plusMinus(arr);

        bufferedReader.close();
    }
}
