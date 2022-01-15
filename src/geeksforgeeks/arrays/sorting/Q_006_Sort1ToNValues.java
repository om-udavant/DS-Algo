package geeksforgeeks.arrays.sorting;

// Efficient Java program to sort an
// array of numbers in range from 1
// to n.

public class Q_006_Sort1ToNValues {

    public static void main(String[] args){

        int []arr = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
        int n = arr.length;

        sort(arr, n);

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort(int[] arr, int n) {

        for (int i = 0; i < n; i++)
        {
            arr[i]=i+1;
        }
    }
}
