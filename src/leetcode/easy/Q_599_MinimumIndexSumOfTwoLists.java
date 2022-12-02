package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q_599_MinimumIndexSumOfTwoLists {

    /*
     * Given two arrays of strings list1 and list2, find the common strings with the least index sum.
     * A common string is a string that appeared in both list1 and list2.
     * A common string with the least index sum is a common string such that if it appeared at
     * list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
     * Return all the common strings with the least index sum. Return the answer in any order.
     *
     */

    public static void main(String[] args) {

    }

    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        int total = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.get(list2[i]) != null) {
                total = i + map.get(list2[i]);
                if (total < min) {
                    min = total;
                    result.clear();
                    result.add(list2[i]);
                } else if (total == min) {
                    result.add(list2[i]);
                }

            }
        }

        String[] arr = new String[result.size()];
        return result.toArray(arr);

    }
}
