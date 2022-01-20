package geeksforgeeks.arrays.searching;

//Java program to search, insert and delete an element
//in the given array.

import java.util.Arrays;

public class Q_001_SearchInsertDelete {

    public static void main(String[] args){

        int[] arr = new int[20];

        arr[0] = 12;
        arr[1] = 34;
        arr[2] = 10;
        arr[3] = 40;
        arr[4] = 6;
        arr[10] = 40;

        int n = arr.length;

        int find = 40;

        System.out.println("\nZero Represents Null Position.\n");

        System.out.println(Arrays.toString(arr));
        search(arr, n, find);

        int in = 50;
        System.out.println("\nArray Before Insertion  " + Arrays.toString(arr));
        insert(arr, n, in);

        System.out.println("\nArray Before Deleting the ELement  " + Arrays.toString(arr));
        delete(arr, n, find);
    }

    private static void delete(int[] arr, int n, int find) {

        int pos = findElement(arr, n, find);

        for(int i = pos; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        if(pos == -1){
        System.out.println("Element Not Found.");
        }else {
            System.out.println("Array Afer Deleted the Element  " + Arrays.toString(arr));
        }
    }

    private static int findElement(int[] arr, int n, int find) {

        for(int i = 0; i < n - 1; i++){
            if(arr[i] == find){
                return i;
            }
        }
        return -1;
    }

    private static void insert(int[] arr, int n, int in) {

        int insert = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                insert = i;
                arr[i] = in;
                break;
            }
        }

        if(insert == -1){
            System.out.println("ELement Cannot be Inserted.");
        }else {
            System.out.println("Array After Insertion  " + Arrays.toString(arr));
        }


    }

    private static void search(int[] arr, int n, int find) {

        int k = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == find){
               k = i;
               break;
            }
        }
        if(k == -1){
            System.out.println("Element not Found");
        }else {
            System.out.println("Element Found at Position " + (k + 1));
        }
    }
}
