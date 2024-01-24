package leetcode.TopInterview150.medium;

public class Q_0045_JumpGameII {

    /*
     * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
     * Each element nums[i] represents the maximum length of a forward jump from index i.
     * In other words, if you are at nums[i], you can jump to any nums[i + j] where:
     *   - 0 <= j <= nums[i] and
     *   - i + j < n
     * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
     *
     */

    public static void main(String[] args) {

    }

    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int currReach = 0, i = 0, jumps = 0, prevReach = 0;
        for (int x : nums) {
            currReach = Math.max(currReach, i + x);
            if (currReach >= nums.length - 1) {
                return jumps + 1;
            }
            if (i == prevReach) {
                jumps++;
                prevReach = currReach;
            }
            i++;
        }
        return jumps;
    }
}
