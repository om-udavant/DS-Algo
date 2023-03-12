package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q_0022_GenerateParentheses {

    /*
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     *
     */

    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        recurse(res, 0, 0, "", n);
        return res;

    }

    public void recurse(List<String> res, int left, int right, String s, int n) {

        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }

        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }

    }
}
