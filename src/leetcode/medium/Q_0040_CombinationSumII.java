package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_0040_CombinationSumII {

    /*
     * Given a collection of candidate numbers (candidates) and a target number (target),
     * find all unique combinations in candidates where the candidate numbers sum to target.
     * Each number in candidates may only be used once in the combination.
     * Note: The solution set must not contain duplicate combinations.
     *
     */

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }

    public void solve(int ind, int target, int[] candidates, List<List<Integer>> ans, ArrayList<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = ind; i < candidates.length; i++) {
            if (i != ind && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            temp.add(candidates[i]);
            solve(i + 1, target - candidates[i], candidates, ans, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
