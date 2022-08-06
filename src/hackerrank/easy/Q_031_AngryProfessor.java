package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_031_AngryProfessor {

    /*
     * Complete the 'angryProfessor' function below.
     *
     * A Discrete Mathematics professor has a class of students.
     * Frustrated with their lack of discipline, the professor decides to cancel
     * class if fewer than some number of students are present when class starts.
     * Arrival times go from on time to arrived late.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static void main(String[] args){

        List<Integer> a = new ArrayList<>();
        a.add(-1);
        a.add(-3);
        a.add(4);
        a.add(2);

        int k = 3;

        String result = angryProfessor(k, a);

        System.out.println(result);
    }

    private static String angryProfessor(int k, List<Integer> a) {

        int count = 0;

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) <= 0){
                count++;
            }
        }

        if(count >= k){
            return "NO";
        }else{
            return "YES";
        }
    }
}