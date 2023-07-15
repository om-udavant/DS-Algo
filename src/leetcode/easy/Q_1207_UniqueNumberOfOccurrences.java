package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q_1207_UniqueNumberOfOccurrences {

    /*
     * Given an array of integers arr,
     * return true if the number of occurrences of each value in the array is unique or false otherwise.
     *
     */

    public static void main(String[] args) {

    }

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();

    }
}
