package leetcode.easy;

public class Q_169_MajorityElement {

    /*
     *
     * Given an array nums of size n, return the majority element.
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     *
     * */

    public int majorityElement(int[] nums) {

        int maj = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != maj) {
                count--;
                if (count == 0) {
                    maj = nums[i];
                    count++;
                }
            } else {
                count++;
            }

        }

        return maj;

    }

}
