package hackerrank.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q_005_DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftdiagonal = 0, rightdiagonal = 0;
        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
        return Math.abs(leftdiagonal - rightdiagonal);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Which arry type like 2 or 3");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        int no;
        for (int row = 0; row < n; row++){
            List<Integer> arr1 = new ArrayList<>();
            for (int col = 0; col < n; col++){
                System.out.println("Enter the elemnt at [" + row + "] [" + col + "]");
                no = Integer.parseInt(bufferedReader.readLine());
                arr1.add(no);
            }
            arr.add(arr1);
        }

        System.out.println("\nArrayList is ");
        for(int row=0;row<arr.size();row++) {
            for(int col=0;col<arr.get(0).size();col++) {
                System.out.print(arr.get(row).get(col)+" ");
            }
            System.out.println("");
        }

        int result = diagonalDifference(arr);
        System.out.println("\nDiagonal Differnce is " + result);

        bufferedReader.close();
    }
}
