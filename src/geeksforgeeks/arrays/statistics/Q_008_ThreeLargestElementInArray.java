package geeksforgeeks.arrays.statistics;

public class Q_008_ThreeLargestElementInArray {
    public static void main(String[] args){

        int[] arr = {5, 1, 2, 87, 65, 24, 23, 45, 14, 21, 78, 90};

        largest(arr);
    }

    private static void largest(int[] arr) {

        int n = arr.length;
        int first = 0, second = 0, third = 0;

        if(n < 3){
            System.out.println("Invalid Input.");
        }

        for(int i = 0; i < n; i++){

            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second){
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third){
                third = arr[i];
            }
        }

        System.out.println("The Three Largest Element in the array are " + first +", " + second + ", " + third);
    }
}
