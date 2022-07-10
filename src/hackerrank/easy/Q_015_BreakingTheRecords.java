package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_015_BreakingTheRecords {

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        List<Integer> result = breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i) + " ");
        }
    }

    private static List<Integer> breakingRecords(List<Integer> scores) {

        int high = scores.get(0);
        int low = scores.get(0);
        int countHigh = 0, countLow = 0;
        List<Integer> arr = new ArrayList<Integer>(2);

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > high) {
                high = scores.get(i);
                countHigh++;
            }
            if (scores.get(i) < low) {
                low = scores.get(i);
                countLow++;
            }
        }
        arr.add(countHigh);
        arr.add(countLow);
        return arr;
    }
}
