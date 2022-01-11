package geeksforgeeks.arrays.rearrangement;

// Recursive Java Program to reverse an array

import java.util.Arrays;

public class Q_002_ReverseArray1 {

    public static void main(String[] args){

        int[] arr = {1, 2 , 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));

        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {

        if(start == end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start+1, end-1);

    }

}
