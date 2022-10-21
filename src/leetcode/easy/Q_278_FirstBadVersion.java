package leetcode.easy;

public class Q_278_FirstBadVersion {

    /*
     * You are a product manager and currently leading a team to develop a new product.
     * \Unfortunately, the latest version of your product fails the quality check.
     * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
     * which causes all the following ones to be bad.
     * You are given an API bool isBadVersion(version) which returns whether version is bad.
     * Implement a function to find the first bad version. You should minimize the number of calls to the API.
     * */

    public static void main(String[] args) {

    }

    /*
     * The isBadVersion API is defined in the parent class VersionControl.boolean isBadVersion(int version);
     * */

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (right > left) {
            int mid = left + (right - left) / 2;
            boolean isBad = isBadVersion(mid);
            if (isBad == true) right = mid;
            if (isBad == false) {
                left = mid + 1;
            }
        }

        return left;

    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
