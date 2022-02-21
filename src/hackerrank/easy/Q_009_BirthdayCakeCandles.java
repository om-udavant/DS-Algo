package hackerrank.easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_009_BirthdayCakeCandles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * You are in charge of the cake for a child's birthday. You have decided the cake will have
     * one candle for each year of their total age. They will only be able to blow out the tallest of the candles.
     * Count how many candles are tallest.
     *
     * Example
     * candels = [4, 4, 1, 3]
     * The maximum height candles are 4 units high. There are 2 of them, so return 2.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many elements do you want to insert ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int element;
        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Enter the " + (i + 1) + " Element ");
            element = Integer.parseInt(bufferedReader.readLine());
            candles.add(element);
        }
        int result = birthdayCakeCandles(candles);

        System.out.println("Number of candles that are tall " + result);

        bufferedReader.close();
    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        int a = 0, max;
        max = candles.get(0);
        for(int i = 0; i < candles.size(); i++){
            if(max < candles.get(i)){
                max = candles.get(i);
            }
        }

        for(int i = 0; i < candles.size(); i++){
            if(max == candles.get(i)){
                a++;
            }
        }

        return a;
    }
}
