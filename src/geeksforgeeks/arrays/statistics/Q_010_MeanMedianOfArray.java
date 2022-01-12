package geeksforgeeks.arrays.statistics;

// Java program to find mean
// and median of an array

import java.util.Arrays;

public class Q_010_MeanMedianOfArray {

    public static void main(String[] args){

        int[] arr = {1, 3, 4, 2, 7, 5, 8, 6};

        mean(arr);
        median(arr);
    }

    private static void median(int[] arr) {

        int n = arr.length;

        Arrays.sort(arr);

        if(n % 2 != 0){
            System.out.println("The Median Value is " + (double)(arr[n / 2]));
        }

        System.out.println("The Median Value is " + (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0);
    }

    private static void mean(int[] arr) {

        int n = arr.length, sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        System.out.println("The Mean Value is " + (double)sum / (double)n);
    }
}
