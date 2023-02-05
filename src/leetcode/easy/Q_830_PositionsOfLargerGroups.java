package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_830_PositionsOfLargerGroups {

    /*
     * In a string s of lowercase letters, these letters form consecutive groups of the same character.
     * For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
     * A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group.
     * In the above example, "xxxx" has the interval [3,6].
     * A group is considered large if it has 3 or more characters.
     * Return the intervals of every large group sorted in increasing order by start index.
     *
     */

    public static void main(String[] args) {

    }

    public List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> ans = new ArrayList();

        int i = 0;
        int n = s.length();

        for (int j = 0; j < n; j++) {

            if (j == n - 1 || s.charAt(j) != s.charAt(j + 1)) {

                if (j - i + 1 >= 3) {
                    ans.add(Arrays.asList(new Integer[]{i, j}));
                }
                i = j + 1;
            }
        }

        return ans;

    }
}
