package leetcode.easy;

import java.util.HashMap;

public class Q_1287_ElementAppearingMoreThan25InSortedArray {

    /*
     * Given an integer array sorted in non-decreasing order,
     * there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
     *
     */

    public static void main(String[] args) {

    }

    public int findSpecialInteger(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i : map.keySet()){
            if(max < map.get(i)){
                max = map.get(i);
                result = i;
            }
        }

        return result;

    }

}
