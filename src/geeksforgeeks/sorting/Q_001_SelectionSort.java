package geeksforgeeks.sorting;

import java.util.Arrays;

public class Q_001_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr;
    }
}
