package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q_0077_Combinations {

    /*
     * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
     * You may return the answer in any order.
     *
     */

    public static void main(String[] args) {

    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        List<Integer> ans = new ArrayList<>();
        solve(1, n, k, ans);
        return res;

    }

    void solve(int num, int n, int k, List<Integer> ans) {
        if (ans.size() == k) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for (int i = num; i <= n; i++) {
            ans.add(i);
            solve(i + 1, n, k, ans);
            ans.remove(ans.size() - 1);
        }
    }

}
