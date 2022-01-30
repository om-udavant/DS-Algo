package geeksforgeeks.arrays.rotation;

import java.util.Arrays;

public class Q_006_FindAPairInRotatedAndSortedArray {

    public static void main(String[] args) {

        int[] arr = {11, 15, 26, 38, 9, 10};

        int key = 26;

        int[] arr1 = findTheSum(arr, arr.length, key);
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] findTheSum(int[] arr, int length, int key) {

        int out[] = new int[]{-1, -1};
        int k = 0;

            while (arr[k] < arr[k + 1]) {
                k++;
            }


        int i = k + 1, j = k;

        while ((i - j) !=  0) {
            int val = arr[i] + arr[j];

            if (val == key) {
                out[0] = arr[i];
                out[1] = arr[j];
                return out;
            } else if (val < key) {
                i++;
                if (i > length - 1) {
                    i = 0;
                }
            }
            else if (val > key) {
                j--;
                if (j < 0) {
                    j = length - 1;
                }
            }


        }
        return out;
    }
}
