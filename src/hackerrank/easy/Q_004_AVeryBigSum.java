package hackerrank.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q_004_AVeryBigSum {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {

        long longSum = 0;

        for(int i = 0; i < ar.size(); i++){
            longSum = longSum + ar.get(i);
        }
        return longSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many element you want to enter ");
        int arCount = Integer.parseInt(bufferedReader.readLine());

        List<Long> ar = new ArrayList<>();

        long no;
        for(int i = 0; i < arCount; i++){
            System.out.println("Enter the " + (i + 1) + " Elements ");
            no = Long.parseLong(bufferedReader.readLine());
            ar.add(no);
        }


        long result = aVeryBigSum(ar);

        System.out.println("Long sum of the List is " + result);
        bufferedReader.close();

    }

}
