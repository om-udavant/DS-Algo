package geeksforgeeks.arrays.sorting;

import java.util.Arrays;

public class Q_001_AlternativeSorting {

    public static void main(String[] args){
        int[] arr = {1, 12, 4, 6, 7, 10, 2};
        int n = arr.length;
        alternativeSort(arr, n);
    }

    private static void alternativeSort(int[] arr, int n) {

        Arrays.sort(arr);

        int i = 0, j = n - 1;
        while (i < j){
            System.out.print(arr[j] + " " + arr[i] + " ");
            i++;
            j--;
        }

        if(n%2 != 0){
            System.out.print(arr[i]);
        }
    }
}
