package geeksforgeeks.arrays.statistics;

//Find the Largest Element in an Unsorted Array

public class Q_007_LargestElementInArray {

    public static void main(String[] args){

        int[] arr = {4, 8, 6, 78, 2, 1, 56, 23};

        System.out.println("The Largest Element in the Array is " + largest(arr));
    }

    private static int largest(int[] arr) {

        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > max){
                max = arr[i];
            }
        return max;
    }
}
