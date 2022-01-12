package geeksforgeeks.arrays.statistics;

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
