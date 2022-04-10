package geeksforgeeks.searching.searchAlgorithums;

import java.util.Arrays;

public class Q_005_ExponentialSearch {

    public static void main(String[] args){
        int[] arr = {2, 3, 4, 10, 40};
        int find = 10;

        int index = exponential(arr, arr.length, find);

        System.out.println((index < 0) ? "Element is not present in array" : "Element is present at index " + index);
    }

    private static int exponential(int[] arr, int length, int find) {


        if(arr[0] == find){
            return 0;
        }

        int i = 1;

        while(i < length && arr[i] <= find){
            i = i * 2;
        }

        return Arrays.binarySearch(arr, i / 2, Math.min(i, length - 1), find);
    }
}
