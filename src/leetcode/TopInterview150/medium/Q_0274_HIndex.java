package leetcode.TopInterview150.medium;

public class Q_0274_HIndex {

    /*
     * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper,
     * return the researcher's h-index.
     * According to the definition of h-index on Wikipedia:
     *   -The h-index is defined as the maximum value of h such that the given researcher has published at least h papers
     *    that have each been cited at least h times.
     *
     */

    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {

        int n = citations.length;
        int[] arr = new int[n + 1];

        for (int c : citations) {
            if (c > n) {
                arr[n]++;
            } else {
                arr[c]++;
            }
        }

        int count = 0;
        for (int i = n; i >= 0; i--) {
            count = count + arr[i];
            if (count >= i) {
                return i;
            }
        }

        return count;

    }
}
