package geeksforgeeks.arrays.statistics;

//        Given an array and a number k where k is smaller than the size of the array,we
//        need to find the k’th smallest element in the given array.
//        It is given that all array elements are distinct.

import java.util.Arrays;

public class Q_001_KthSmallestElement {

    public static void main(String[] args){

        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;
        System.out.println("Kth Smallest Element is " + KthSmallest(arr, k));
    }

    private static int KthSmallest(int[] arr, int k) {

        Arrays.sort(arr);

        return arr[k - 1];
    }
}
