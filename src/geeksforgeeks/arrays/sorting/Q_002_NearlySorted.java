package geeksforgeeks.arrays.sorting;

import java.util.Arrays;

public class Q_002_NearlySorted {
    public static void main(String[] args){
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int n = arr.length;

        insertionSort(arr, n);
    }

    private static void insertionSort(int[] arr, int n) {

        for(int i  = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

            System.out.print(Arrays.toString(arr));

    }
}
