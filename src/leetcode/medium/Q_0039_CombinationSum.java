package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q_0039_CombinationSum {

    /*
     * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations
     * of candidates where the chosen numbers sum to target. You may return the combinations in any order.
     * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
     * frequency of at least one of the chosen numbers is different.
     * The test cases are generated such that the number of unique combinations that sum up to target is less than 150
     * combinations for the given input.
     *
     */

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }

    public void solve(int ind, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> temp) {

        if (ind == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        if (candidates[ind] <= target) {
            temp.add(candidates[ind]);
            solve(ind, candidates, target - candidates[ind], ans, temp);
            temp.remove(temp.size() - 1);
        }

        solve(ind + 1, candidates, target, ans, temp);

    }
}
