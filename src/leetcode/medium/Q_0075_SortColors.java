package leetcode.medium;

public class Q_0075_SortColors {

    /*
     * Given an array nums with n objects colored red, white, or blue,
     * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     * You must solve this problem without using the library's sort function.
     *
     */

    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {

        int min = 3;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }

}
