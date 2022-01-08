package geeksforgeeks.arrays.rotation;

import java.util.Arrays;

public class Q_001_LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int length) {

        int temp = arr[0];
        for(int i = 0; i < length-1 ;i++){
            arr[i] = arr[i+1];
        }
        arr[length-1] = temp;
    }
}
