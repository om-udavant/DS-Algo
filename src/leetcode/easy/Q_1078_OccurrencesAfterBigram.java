package leetcode.easy;

import java.util.ArrayList;

public class Q_1078_OccurrencesAfterBigram {

    /*
     * Given two strings first and second, consider occurrences in some text of the form "first second third",
     * where second comes immediately after first, and third comes immediately after second.
     * Return an array of all the words third for each occurrence of "first second third".
     *
     */

    public static void main(String[] args) {

    }

    public String[] findOcurrences(String text, String first, String second) {

        String arr[] = text.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1].equals(second) && arr[i - 2].equals(first)) {
                list.add(arr[i]);
            }
        }

        String ans[] = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            ans[j] = list.get(j);
        }

        return ans;

    }
}
