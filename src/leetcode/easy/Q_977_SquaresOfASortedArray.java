package leetcode.easy;

public class Q_977_SquaresOfASortedArray {

    /*
     * Given an integer array nums sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     *
     */

    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        /*
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
        */


        int i = 0;
        int j = nums.length - 1;
        int[] result = new int[nums.length];

        for (int n = nums.length - 1; n >= 0; n--) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[n] = nums[i] * nums[i];
                i++;
            } else {
                result[n] = nums[j] * nums[j];
                j--;
            }

        }

        return result;
    }
}
