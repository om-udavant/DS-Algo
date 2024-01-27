package leetcode.TopInterview150.medium;

public class Q_0238_ProductOfArrayExceptSelf {

    /*
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of
     * nums except nums[i].
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     */

    public static void main(String[] args) {

    }

    public int[] productExceptSelf(int[] nums) {


        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * r;
            r *= nums[i];
        }

        return result;

        /*
        int n = nums.length;

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;

        for(int i = 1; i < n; i++){
            leftProduct[i] = nums[i - 1] * leftProduct[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            rightProduct[i] = nums[i + 1] * rightProduct[i + 1];
        }

        for(int i = 0; i < n; i++){
            nums[i] = leftProduct[i] * rightProduct[i];
        }

        return nums;
*/
    }
}
