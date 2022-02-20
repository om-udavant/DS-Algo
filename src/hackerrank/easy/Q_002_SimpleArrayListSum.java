package hackerrank.easy;

import java.io.*;
import java.util.*;

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

public class Q_002_SimpleArrayListSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many element you want to enter ");
        int arCount = Integer.parseInt(bufferedReader.readLine());

        int no;

        List<Integer> ar = new ArrayList<>();
        System.out.println("Enter the Elements ");
        for(int i = 0; i < arCount; i++){
            no = Integer.parseInt(bufferedReader.readLine());
            ar.add(no);
        }

        int result = simpleArraySum(ar);

        System.out.println("Sum of the Elements in the list is " + result);

        bufferedReader.close();
    }

    public static int simpleArraySum(List<Integer> ar) {

        int sum = 0;
        for(int i = 0; i < ar.size(); i++){
            sum = sum + ar.get(i);
        }
        return sum;

    }
}
