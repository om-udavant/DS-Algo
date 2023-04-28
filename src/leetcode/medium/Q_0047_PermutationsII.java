package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q_0047_PermutationsII {

    /*
     *
     * Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
     *
     */

    public static void main(String[] args) {

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;

    }

    private void permuteHelper(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums, boolean[] used) {

        if (tempList.size() == nums.length && !resultList.contains(tempList)) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            used[i] = true;
            tempList.add(nums[i]);

            permuteHelper(resultList, tempList, nums, used);

            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}
