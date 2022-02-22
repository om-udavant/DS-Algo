package hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_011_GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of students");
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < gradesCount; i++){

            System.out.println("Enter the for " + (i + 1) + "st Student ");
            int x = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(x);
        }

        List<Integer> result = gradingStudents(grades);
        System.out.println("grades \n" + result);

        bufferedReader.close();
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++){
            int x = grades.get(i);
            if(x >= 38){
                int remainder = x % 5;
                int least = x - remainder;
                int upper = least + 5;
                int difference = upper - x;

                if(difference < 3){
                    x = upper;
                }
            }
            ans.add(x);
        }
        return ans;
    }
}
