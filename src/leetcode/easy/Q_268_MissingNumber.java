package leetcode.easy;

public class Q_268_MissingNumber {

    /*
     *
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     *
     * */

    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {


        int sum1 = 0, sum2 = 0;

        for (int i : nums) {
            sum1 += i;
        }

        for (int i = 0; i <= nums.length; i++) {
            sum2 += i;
        }

        return (sum2 - sum1);

        /*
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){

            if(i != nums[i]){
                return i;
            }

        }

        return nums.length;
        */
    }
}
