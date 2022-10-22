package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_350_IntersectionOfTwoArraysII {

    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;

        while(nums1.length > i && nums2.length > j){

            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[arr.size()];
        for(int m = 0; m < arr.size(); m++){
            ans[m] = arr.get(m);
        }

        return ans;

    }
}
