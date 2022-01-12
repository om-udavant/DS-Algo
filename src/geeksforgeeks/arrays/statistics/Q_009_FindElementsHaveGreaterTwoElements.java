package geeksforgeeks.arrays.statistics;

// Java program to find all
// elements in array which
// have at-least two greater
// elements itself.

import java.util.Arrays;

public class Q_009_FindElementsHaveGreaterTwoElements {

    public static void main(String[] args){

        int[] arr = {2, -6 ,3 , 5, 1, 7};

        findElement(arr);
    }

    private static void findElement(int[] arr) {

        int n = arr.length - 2;
        Arrays.sort(arr);

        System.out.println("The three elements have two or more greater elements :- ");
        for(int i = 0; i < n; i++){

            System.out.print(arr[i] + " ");
        }
    }
}
