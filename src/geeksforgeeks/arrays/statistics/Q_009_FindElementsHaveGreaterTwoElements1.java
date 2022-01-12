package geeksforgeeks.arrays.statistics;

import java.util.Arrays;

public class Q_009_FindElementsHaveGreaterTwoElements1 {

    public static void main(String[] args){

        int[] arr = {2, -6 ,3 , 5, 1, 7};

        findElement(arr);
    }

    private static void findElement(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){

                if(arr[j] > arr[i]){
                    count++;
                }
            }
            if(count >= 2){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
