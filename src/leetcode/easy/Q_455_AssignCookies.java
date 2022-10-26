package leetcode.easy;

import java.util.Arrays;

public class Q_455_AssignCookies {

    /*
     *
     * Assume you are an awesome parent and want to give your children some cookies.
     * But, you should give each child at most one cookie.
     * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
     * and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i,
     * and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
     *
     */

    public static void main(String[] args) {

    }

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int gIndex = 0;
        int sIndex = 0;

        if (g.length == 0 || s.length == 0) {
            return 0;
        }

        while (gIndex < g.length && sIndex < s.length) {

            if (s[sIndex] >= g[gIndex]) {
                gIndex++;
            }

            sIndex++;

        }

        return gIndex;

    }
}
