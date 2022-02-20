package hackerrank.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 *
 * The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
 * If a[i] > b[i], then Alice is awarded 1 point.
 * If a[i] < b[i], then Bob is awarded 1 point.
 * If a[i] = b[i], then neither person receives a point.
 *
 * Example
 * a = [1, 2, 3]
 * b = [3, 2, 1]
 * For elements *0*, Bob is awarded a point because a[0] .
 * For the equal elements a[1] and b[1], no points are earned.
 * Finally, for elements 2, a[2] > b[2] so Alice receives a point.
 * The return array is [1, 1] with Alice's score first and Bob's second.
 */

public class Q_003_CompareTheTriplets {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = new ArrayList<>();

        List<Integer> b = new ArrayList<>();

        int no1;
        for(int i = 0; i < 3; i++){
            System.out.println((i + 1) + " Element of the list1");
            no1 = Integer.parseInt(bufferedReader.readLine());
            a.add(no1);
        }

        int no2;
        for(int i = 0; i < 3; i++){
            System.out.println((i + 1) + " Element of the list2");
            no2 = Integer.parseInt(bufferedReader.readLine());
            b.add(no2);
        }

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);

        bufferedReader.close();
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int a1 = 0, a2 = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                a1++;
            }else if(a.get(i) < b.get(i)){
                a2++;
            }
        }
        list.add(a1);
        list.add(a2);
        return list;

    }

}
