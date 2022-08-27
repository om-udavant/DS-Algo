package hackerrank.easy;

import java.util.ArrayList;

public class Q_045_ACMICPCTeam {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static void main(String[] args) {

        ArrayList<String> topic = new ArrayList<>();
        topic.add("10101");
        topic.add("11110");
        topic.add("00010");

        ArrayList<Integer> result = acmTeam(topic);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result);
        }
    }

    private static ArrayList<Integer> acmTeam(ArrayList<String> topic) {

        int max = 0;
        int count = 0;
        int counter = 0;

        for (int i = 0; i < topic.size(); i++) {
            for (int j = i; j < topic.size(); j++) {
                count = compareStr(topic.get(i), topic.get(j));
                if (count > max) {
                    max = count;
                    counter = 1;
                } else if (count == max) {
                    counter++;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(max);
        result.add(counter);

        return result;
    }

    private static int compareStr(String s1, String s2) {

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1' || s2.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
