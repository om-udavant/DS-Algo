package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q_448_FindAllNumbersDisappearedInAnArray {

    /*
     *
     * Given an array nums of n integers where nums[i] is in the range [1, n],
     * return an array of all the integers in the range [1, n] that do not appear in nums.
     *
     */

    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(Integer n : nums){
            set.add(n);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        return list;

    }
}
