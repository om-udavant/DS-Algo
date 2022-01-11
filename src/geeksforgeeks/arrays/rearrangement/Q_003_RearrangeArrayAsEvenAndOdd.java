package geeksforgeeks.arrays.rearrangement;

// Java program to rearrange the array as per the given condition

import java.util.Arrays;

public class Q_003_RearrangeArrayAsEvenAndOdd {

    public static void main(String args[]){
        int[] arr = new int []{ 1, 2, 3, 4, 5,
                6, 7 };
        int size = arr.length;
        rearrangeArr(arr, size);

    }

    public static void rearrangeArr(int arr[], int n) {

        int evenPos = n / 2;

        int oddPos = n - evenPos;

        int[] tempArr = new int [n];

        for (int i = 0; i < n; i++)
            tempArr[i] = arr[i];

        Arrays.sort(tempArr);

        int j = oddPos - 1;

        for (int i = 0; i < n; i += 2) {
            arr[i] = tempArr[j];
            j--;
        }

        j = oddPos;

        for (int i = 1; i < n; i += 2) {
            arr[i] = tempArr[j];
            j++;
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
