package geeksforgeeks.arrays.rotation;

import java.util.Arrays;

public class Q_004_RightRotation1 {


    static int arr[] = new int[]{1,2,3,4,5};

    public static void main(String args[]){

        System.out.println("Given Array is : ");
        System.out.println(Arrays.toString(arr));

        rotate();

        System.out.println("Rotated Array is : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate() {

        int i  = 0, j = arr.length - 1;

        while (i != j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
        }
    }

}
