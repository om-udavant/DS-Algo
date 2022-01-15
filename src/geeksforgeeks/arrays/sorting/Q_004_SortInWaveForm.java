package geeksforgeeks.arrays.sorting;

// Java implementation of naive method for sorting
// an array in wave form.

import java.util.Arrays;

public class Q_004_SortInWaveForm {

    public static void main(String[] args){

    int[] arr = {10, 90, 49, 2, 1, 5, 23};
    int n = arr.length;

    sortInWave(arr, n);
    }

    private static void sortInWave(int[] arr, int n) {

        int i;
        Arrays.sort(arr);
        for(i = 0; i < n - 1; i+=2){
            swap(arr, i, i + 1);
        }

        System.out.print(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
