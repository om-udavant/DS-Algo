package geeksforgeeks.arrays.rotation;

import java.util.Arrays;

public class Q_002_RightRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int length) {

        int temp = arr[arr.length-1];
        for(int i = arr.length-1; i > 0 ;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
